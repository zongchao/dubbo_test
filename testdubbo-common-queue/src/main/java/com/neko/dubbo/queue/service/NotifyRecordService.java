package com.neko.dubbo.queue.service;

import com.neko.dubbo.common.exceptions.BaseException;
import com.neko.dubbo.queue.dao.po.NotifyRecord;

/**
 * Created by ssjk on 2016/12/23.
 */
public interface NotifyRecordService {

    NotifyRecord findById(Integer id);

    int insert(NotifyRecord notifyRecord) throws Exception;

}


