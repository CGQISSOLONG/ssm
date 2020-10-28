package com.ssm.commom.utils;

import com.ssm.commom.base.BaseResult;
import com.ssm.commom.base.ResultEnum;

public class BaseResultUtil {

    /**
     * 访问成功是调用的api  包含data
     * @param object
     */
    public static BaseResult success(Object object){
        BaseResult result = new BaseResult();
        result.setCode(200);
        result.setData(object);
        result.setMsg("success");
        return result;
    }

    /**
     * 访问成功时调用 不包含data
     */
    public static BaseResult success(){
        return success(null);
    }


    /**
     * 失败调用的api
     * @param code
     * @param msg
     * @return
     */
    public static BaseResult error(int code, String msg){
        BaseResult result = new BaseResult();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 返回异常情况 不包含data
     * @param resultEnum
     * @return
     */
    public static BaseResult error(ResultEnum resultEnum){
        return error(resultEnum.getCode(),resultEnum.getMsg());
    }

    /**
     * 返回异常情况api 包含data
     * @param resultEnum
     * @param object
     * @return
     */
    public static BaseResult error(ResultEnum resultEnum, Object object){
        BaseResult result = error(resultEnum);
        result.setData(object);
        return result;
    }

    /**
     * 全局基类自定义异常 异常处理
     * @param e
     * @return
     */
    public static BaseResult error(BaseException e){
        return error(e.getCode(),e.getMessage());
    }


}
