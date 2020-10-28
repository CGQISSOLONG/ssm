package com.ssm.commom.utils;

import com.ssm.commom.base.ResultEnum;
import lombok.Data;

@Data
public class BaseException extends RuntimeException {

    public int code;

    public BaseException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
