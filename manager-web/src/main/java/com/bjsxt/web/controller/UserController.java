package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version V1.0
 * @Description:
 * @author: humm
 * @date: 2020-09-22 22:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        //System.out.println("参数检验");
        //System.out.println(users.getUserage()+" "+users.getUsername()+" "+users.getUserid());
        System.out.println("测试");
        this.userService.addUser(users);
        return "ok";
    }
}
