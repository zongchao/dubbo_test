package com.neko.dubbo.queue.message;

import com.neko.dubbo.common.enums.BaseStatusEnum;
import com.neko.dubbo.common.exceptions.BaseException;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;
import java.io.Serializable;

/**
 * Created by ssjk on 2016/12/10.
 */
@Service
public class MessageSender {

    @Autowired
    private final JmsTemplate jmsTemplate;
    @Autowired
    private final Destination destination;


    @Autowired
    NotifyRecordService notifyRecordService;



    public MessageSender(final JmsTemplate jmsTemplate, final Destination destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    public void sendQueueMessage(String queueName, String msg) {
        sendMessage(new ActiveMQQueue(queueName), msg);
    }

    /**
     * 向指定队列发送消息
     */
    public void sendMessage(Destination destination, final Object msg) {
        System.out.println("向队列" + destination.toString() + "发送了消息------------" + msg);
        try {
            NotifyRecord notifyRecord = new NotifyRecord();
            notifyRecord.setStatus(BaseStatusEnum.INIT.getValue());
            notifyRecord.setMessage(msg.toString());
            notifyRecordService.insert(notifyRecord);

            final String messageId = notifyRecord.getMessageId();
            jmsTemplate.send(destination, session -> {
                ObjectMessage objectMessage = session.createObjectMessage((Serializable) msg);
                objectMessage.setJMSCorrelationID(messageId);
                return objectMessage;
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 向默认队列发送消息
     */
    public void sendMessage(final Object msg) {
        sendMessage(jmsTemplate.getDefaultDestination(), msg);
//        System.out.println("向队列" + destination + "发送了消息------------" + msg);
//        jmsTemplate.send(new MessageCreator() {
//            public Message createMessage(Session session) throws JMSException {
//                ObjectMessage objectMessage = session.createObjectMessage((Serializable) msg);
//                objectMessage.setJMSCorrelationID(s);
//                return objectMessage;
//            }
//        });

    }

}
