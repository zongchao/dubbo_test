package com.neko.dubbo.queue.message;

import com.neko.dubbo.common.enums.BaseStatusEnum;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.dao.po.NotifyRecordLog;
import com.neko.dubbo.queue.service.NotifyRecordLogService;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import java.util.Date;
import java.util.Optional;

/**
 * Created by ssjk on 2016/12/11.
 */
@Transactional(rollbackFor = Exception.class)
public class MessageLinstener implements MessageListener {

    @Autowired
    NotifyRecordService notifyRecordService;
    @Autowired
    NotifyRecordLogService notifyRecordLogService;

    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void onMessage(Message message) {

        NotifyRecordLog notifyRecordLog = new NotifyRecordLog();
        String notifyResult = BaseStatusEnum.SUCCESSED.getDesc();

        String messageId = "";
        try {
            messageId = message.getJMSCorrelationID();
        } catch (JMSException e) {
            e.printStackTrace();
        }
        NotifyRecord notifyRecord = notifyRecordService.findByMessageId(messageId);
        // 通过状态等幂，防止重复消费
        if (notifyRecord.getStatus() != BaseStatusEnum.SUCCESSED.getValue()) {
            // do something here such as
//            System.out.println(" id:" + ((ObjectMessage) message).getObject());
//            System.out.println(message.getJMSCorrelationID());
            System.out.println(messageId);

            // 插入notifyRecord表
            notifyRecord.setStatus(BaseStatusEnum.SUCCESSED.getValue());
            notifyRecord.setLastNotifyTime(new Date());
            // 每次更新次数+1 如果为null 初始化为0
            int notifyTimes = Optional.ofNullable(notifyRecord.getNotifyTimes()).orElseGet(() -> 0) + 1;
            notifyRecord.setNotifyTimes(notifyTimes);
            notifyRecordService.update(notifyRecord);

            // 插入notifyRecordLog
            notifyRecordLog.setNotifyRecordId(notifyRecord.getId());
        } else {
            notifyResult = "消息已被处理过";
        }
        notifyRecordLog.setResult(notifyResult);
        notifyRecordLogService.insert(notifyRecordLog);
    }
}
