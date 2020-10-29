package com.ssm.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface LoginInformationDao {

    /**
     * 登录信息插入
     * @param loginTime
     */
    void insertLoginInformation(String loginTime);

}
