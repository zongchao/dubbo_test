package com.neko.dubbo.queue.core;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ssjk on 2016/12/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class MessageSenderTest {
    @Autowired
    MessageSender messageSender;

    @Test
    public void test() {
        Map map = new HashMap();
        map.put("1","test");
        map.put("2","test2");
        messageSender.sendMessage(map);
    }

    @Test
    public void test2() {
        messageSender.sendQueueMessage("test2","abc");
    }

    @Test
    public void test3() {

    }
}
