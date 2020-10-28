package com.ssm.commom.base;

import lombok.Data;

import java.io.Serializable;

/**
 * 作为结果类，统一返回结果类型
 * @param <T>
 */

@Data
public class BaseResult<T> implements Serializable {

    /**
     * 响应状态码
     */
    public int code;

    /**
     * 响应信息  成功为success
     */
    public String msg;

    /**
     * 具体结果
     */
    public T data;



}
