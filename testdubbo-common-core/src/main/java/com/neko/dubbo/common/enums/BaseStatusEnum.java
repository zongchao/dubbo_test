package com.neko.dubbo.common.enums;

/**
 * Created by ssjk on 2016/12/31.
 */
public enum BaseStatusEnum {
    INIT("初始化",0),
    SUCCESSED("成功",1),
    FAILED("失败",2);

    /** 描述  */
    private String desc;
    /** 枚举值 */
    private int value;

    private BaseStatusEnum(String desc , int value){
        this.desc = desc;
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
