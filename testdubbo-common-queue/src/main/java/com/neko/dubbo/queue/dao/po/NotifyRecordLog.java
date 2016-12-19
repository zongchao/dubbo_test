package com.neko.dubbo.queue.dao.po;

import java.util.Date;

public class NotifyRecordLog {
    private Integer id;

    private Integer notifyRecordId;

    private Date createTime;

    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNotifyRecordId() {
        return notifyRecordId;
    }

    public void setNotifyRecordId(Integer notifyRecordId) {
        this.notifyRecordId = notifyRecordId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}