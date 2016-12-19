package com.neko.dubbo.queue.dao.mapper;

import com.neko.dubbo.queue.dao.po.NotifyRecordLog;
import com.neko.dubbo.queue.dao.po.NotifyRecordLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyRecordLogMapper {
    int countByExample(NotifyRecordLogExample example);

    int deleteByExample(NotifyRecordLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NotifyRecordLog record);

    int insertSelective(NotifyRecordLog record);

    List<NotifyRecordLog> selectByExample(NotifyRecordLogExample example);

    NotifyRecordLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NotifyRecordLog record, @Param("example") NotifyRecordLogExample example);

    int updateByExample(@Param("record") NotifyRecordLog record, @Param("example") NotifyRecordLogExample example);

    int updateByPrimaryKeySelective(NotifyRecordLog record);

    int updateByPrimaryKey(NotifyRecordLog record);
}