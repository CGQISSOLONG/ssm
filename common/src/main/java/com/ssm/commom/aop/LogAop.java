package com.ssm.commom.aop;

import com.ssm.dao.LoginInformationDao;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
@Slf4j
public class LogAop {

    private static String m_dateFormat = "yyyy-MM-dd";

    @Autowired
    private LoginInformationDao loginInformationDao;

    @Pointcut("@annotation(com.ssm.commom.aop.LogAopAnnotation)")
    private void pointCutMethod(){

    }

    @Before("pointCutMethod()")
    public void beforeLoginRecord(){
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m_dateFormat);
        String loginDate = simpleDateFormat.format(dateNow);
        loginInformationDao.insertLoginInformation(loginDate);
    }
}
