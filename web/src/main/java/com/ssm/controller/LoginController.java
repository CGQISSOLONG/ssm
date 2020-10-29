package com.ssm.controller;

import com.ssm.commom.aop.LogAopAnnotation;
import com.ssm.commom.base.BaseResult;
import com.ssm.commom.utils.BaseResultUtil;
import com.ssm.entity.User;
import com.ssm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: cgq
 * @Date: 2020/10/29 16:37
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @LogAopAnnotation(name = "")
    public BaseResult login(){
        User user = userService.getUser(1);
        System.out.println(user.toString());
        return BaseResultUtil.success();
    }

}
