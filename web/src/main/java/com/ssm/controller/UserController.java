package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.services.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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
}
