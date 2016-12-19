package com.neko.dubbo.queue.dao.mapper;

import com.neko.dubbo.queue.dao.po.NotifyRecord;
import com.neko.dubbo.queue.dao.po.NotifyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyRecordMapper {
    int countByExample(NotifyRecordExample example);

    int deleteByExample(NotifyRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NotifyRecord record);

    int insertSelective(NotifyRecord record);

    List<NotifyRecord> selectByExampleWithBLOBs(NotifyRecordExample example);

    List<NotifyRecord> selectByExample(NotifyRecordExample example);

    NotifyRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NotifyRecord record, @Param("example") NotifyRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") NotifyRecord record, @Param("example") NotifyRecordExample example);

    int updateByExample(@Param("record") NotifyRecord record, @Param("example") NotifyRecordExample example);

    int updateByPrimaryKeySelective(NotifyRecord record);

    int updateByPrimaryKeyWithBLOBs(NotifyRecord record);

    int updateByPrimaryKey(NotifyRecord record);
}