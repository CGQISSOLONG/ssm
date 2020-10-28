package com.ssm.dao;

import com.ssm.entity.LoginInformation;

public interface LoginInformationDao {

    /**
     * 登录信息插入
     * @param loginTime
     */
    void insertLoginInformation(String loginTime);

}
