package com.neko.dubbo.common.checker;

import jdk.internal.org.objectweb.asm.util.CheckClassAdapter;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by ssjk on 2017/1/30.
 */
public class Checker {

    boolean isPass = true;

    String message = "成功";

    public boolean isPass() {
        return isPass;
    }

    public String getMessage() {
        return message;
    }

    public Checker setMessage(String message) {
        this.message = message;
        return this;
    }

    public Checker strIsBlank(String str) {
        if (isPass) {
            if (!StringUtils.isBlank(str)) {
                isPass = false;
                message = "参数必须是空";
            }
        }
        return this;
    }

    public Checker strIsNotBlank(String str) {
        if (isPass) {
            if (!StringUtils.isNotBlank(str)) {
                isPass = false;
                message = "参数不能为空";
            }
        }
        return this;
    }
}
