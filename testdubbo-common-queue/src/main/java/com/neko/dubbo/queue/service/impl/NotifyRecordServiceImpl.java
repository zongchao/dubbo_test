package com.neko.dubbo.queue.service.impl;

import com.neko.dubbo.common.exceptions.BaseException;
import com.neko.dubbo.queue.dao.mapper.NotifyRecordMapper;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ssjk on 2016/12/23.
 */
@Service
@Transactional
public class NotifyRecordServiceImpl implements NotifyRecordService {

    private static final Logger logger = Logger.getLogger(NotifyRecordServiceImpl.class);

    @Autowired
    NotifyRecordMapper notifyRecordMapper;

    @Override
    public NotifyRecord findById(Integer id) {
        return notifyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(NotifyRecord notifyRecord) {
        notifyRecord.setCreateTime(new Date());
        notifyRecord.setMessageId(UUID.randomUUID().toString().replace("-", ""));
        int result = notifyRecordMapper.insert(notifyRecord);
        if (result <= 0) {
            throw BaseException.DB_INSERT_RESULT_0;
        }
        return result;
    }


}
