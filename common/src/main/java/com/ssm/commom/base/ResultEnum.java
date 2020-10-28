package com.ssm.commom.base;

import lombok.Data;

/**
 * 结果类调用的枚举，填充的是code和msg
 */
public enum ResultEnum {
    SUCCESS(200, "success");

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResultEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
