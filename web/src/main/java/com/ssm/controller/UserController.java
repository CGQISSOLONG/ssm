package com.ssm.controller;

import com.ssm.commom.aop.LogAopAnnotation;
import com.ssm.commom.base.BaseResult;
import com.ssm.commom.utils.BaseResultUtil;
import com.ssm.entity.User;
import com.ssm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public String findAll(){
        System.out.println("12146");
        List<User> all = userService.findAll();
        System.out.println(all.toString());
        return "list";
    }


    @GetMapping("/find")
    public BaseResult find(){
        System.out.println("12146");
        List<User> all = userService.findAll();
        System.out.println(all.toString());
        return BaseResultUtil.success();
    }
}
