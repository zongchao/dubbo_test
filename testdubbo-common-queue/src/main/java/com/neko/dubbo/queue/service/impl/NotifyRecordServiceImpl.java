package com.neko.dubbo.queue.service.impl;

import com.neko.dubbo.common.exceptions.BaseException;
import com.neko.dubbo.queue.dao.mapper.NotifyRecordMapper;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.dao.po.NotifyRecordExample;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by ssjk on 2016/12/23.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class NotifyRecordServiceImpl implements NotifyRecordService {

    private static final Logger logger = Logger.getLogger(NotifyRecordServiceImpl.class);

    @Autowired
    NotifyRecordMapper notifyRecordMapper;

    @Override
    public NotifyRecord findById(Integer id) {
        return notifyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public NotifyRecord findByMessageId(String messageId) {

        NotifyRecordExample example = new NotifyRecordExample();
        example.or().andMessageIdEqualTo(messageId);

        NotifyRecord notifyRecord = null;
        List<NotifyRecord> list = notifyRecordMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(list)) {
            notifyRecord = list.get(0);
        }
//        else {
//            throw BaseException.DB_LIST_IS_NULL;
//        }
        return notifyRecord;
    }

    @Override
    public int insert(NotifyRecord notifyRecord) {
        notifyRecord.setCreateTime(new Date());
        notifyRecord.setMessageId(UUID.randomUUID().toString().replace("-", ""));
        int result = notifyRecordMapper.insert(notifyRecord);
        if (result <= 0) {
            throw BaseException.DB_INSERT_RESULT_0;
        }
        return result;
    }

    @Override
    public int update(NotifyRecord notifyRecord) {
        return notifyRecordMapper.updateByPrimaryKeySelective(notifyRecord);
    }

}
