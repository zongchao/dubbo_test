package com.neko.dubbo.queue.message;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

/**
 * Created by ssjk on 2016/12/11.
 */
public class MessageLinstener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        //do something here
        try {
            System.out.println(" id:" + ((ObjectMessage) message).getObject());
            System.out.println(message.getJMSCorrelationID());
            System.out.println(message);
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }
}
