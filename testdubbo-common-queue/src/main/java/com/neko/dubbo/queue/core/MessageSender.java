package com.neko.dubbo.queue.core;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
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
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createObjectMessage((Serializable) msg);
            }
        });
    }

    /**
     * 向默认队列发送消息
     */
    public void sendMessage(final Object msg) {
        String destination = jmsTemplate.getDefaultDestination().toString();
        System.out.println("向队列" + destination + "发送了消息------------" + msg);
        String s = "123";
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                ObjectMessage objectMessage = session.createObjectMessage((Serializable) msg);
                objectMessage.setJMSCorrelationID(s);
                return objectMessage;
            }
        });

    }

}
