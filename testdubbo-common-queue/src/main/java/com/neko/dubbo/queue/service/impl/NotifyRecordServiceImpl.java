package com.neko.dubbo.queue.service.impl;

import com.neko.dubbo.queue.dao.mapper.NotifyRecordMapper;
import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.service.NotifyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ssjk on 2016/12/23.
 */
@Service
@Transactional
public class NotifyRecordServiceImpl implements NotifyRecordService {

    @Autowired
    NotifyRecordMapper notifyRecordMapper;

    @Override
    public NotifyRecord findById(Integer id) {
        return notifyRecordMapper.selectByPrimaryKey(id);
    }
}
