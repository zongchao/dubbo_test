package com.neko.dubbo.dao;

import com.neko.dubbo.queue.dao.mapper.NotifyRecordMapper;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

/**
 * Created by ssjk on 2016/12/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class NotifyRecordTest {

    Logger logger = Logger.getLogger(NotifyRecordTest.class);
    @Autowired
    NotifyRecordMapper notifyRecordMapper;

    @Autowired
    NotifyRecordService notifyRecordService;

    @Test
    public void test() {
        NotifyRecord notifyRecord = notifyRecordMapper.selectByPrimaryKey(1);
        System.out.println(notifyRecord.getId());
    }

    @Test
    public void test2() {
        NotifyRecord notifyRecord = notifyRecordService.findById(1);
        System.out.println(notifyRecord.getId());
    }

    @Test
    public void test3() {
        NotifyRecord notifyRecord = new NotifyRecord();
        notifyRecord.setNotifyTimes(1);
        System.out.println(Optional.ofNullable(notifyRecord.getNotifyTimes()).orElseGet(() -> 0) + 1);
    }

}
