package com.neko.dubbo.queue.service.impl;

import com.neko.dubbo.common.exceptions.BaseException;
import com.neko.dubbo.queue.dao.mapper.NotifyRecordLogMapper;
import com.neko.dubbo.queue.dao.po.NotifyRecordLog;
import com.neko.dubbo.queue.service.NotifyRecordLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ssjk on 2017/1/3.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class NotifyRecordLogServiceImpl implements NotifyRecordLogService {

    @Autowired
    NotifyRecordLogMapper notifyRecordLogMapper;

    @Override
    public int insert(NotifyRecordLog notifyRecordLog) {

        notifyRecordLog.setCreateTime(new Date());
        int result = notifyRecordLogMapper.insert(notifyRecordLog);
        if (result <= 0) {
            throw BaseException.DB_INSERT_RESULT_0;
        }
        return result;
    }
}
