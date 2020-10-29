package com.ssm.commom.aop;

import com.ssm.entity.User;
import com.ssm.services.LoginInformationService;
import com.ssm.services.UserService;
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
    private LoginInformationService loginInformationService;

    @Autowired
    private UserService userService;



    @Pointcut("@annotation(com.ssm.commom.aop.LogAopAnnotation)")
    private void pointCutMethod(){

    }

    @Before("pointCutMethod()")
    public void beforeLoginRecord(){
        User user = userService.getUser(1);
        String strUserName = user.getUserName();
        System.out.println("欢迎你："+ strUserName);
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m_dateFormat);
        String strLoginDate = simpleDateFormat.format(dateNow);
        loginInformationService.insertLoginInformation(strLoginDate);
        System.out.println("好了，我已经记录你访问这个方法的时间了："+ strLoginDate);
    }
}
