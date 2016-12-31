package com.neko.dubbo.common.exceptions;

/**
 * Created by ssjk on 2016/12/31.
 * 定义异常时，需要先确定异常所属模块。例如：添加系统异常 可以定义为 [00000001] 前四位数为系统模块编号，后4位为错误代码 ,唯一 <br>
 *
 */
public class BaseException extends RuntimeException {

    /**
     * 数据库操作,insert返回0
     */
    public static final BaseException DB_INSERT_RESULT_0 = new BaseException(00000001, "数据库操作,insert返回0");

    /**
     * 数据库操作,update返回0
     */
    public static final BaseException DB_UPDATE_RESULT_0 = new BaseException(00000002, "数据库操作,update返回0");

    /**
     * 数据库操作,selectOne返回null
     */
    public static final BaseException DB_SELECTONE_IS_NULL = new BaseException(00000003, "数据库操作,selectOne返回null");

    /**
     * 数据库操作,list返回null
     */
    public static final BaseException DB_LIST_IS_NULL = new BaseException(00000004, "数据库操作,list返回null");



    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected int code;

    public BaseException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
        this.msg = String.format(msgFormat, args);
    }

    /**
     * 实例化异常
     *
     * @param msgFormat
     * @param args
     * @return
     */
    public BaseException newInstance(String msgFormat, Object... args) {
        return new BaseException(this.code, msgFormat, args);
    }

    public BaseException() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message) {
        super(message);
    }
}
