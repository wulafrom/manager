package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    /**
     * doGet
     *
     * @return
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
       System.out.println("doGet....");

       return "ok";
    }

    /**
     *  doPost
     *
     * @return
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doPost(Users users){
        System.out.println("doPost....");
        System.out.println(users.getUserage()+" "+users.getUserid()+" "+users.getUsername());
        return "ok";
    }

    /**
     *  doDelete
     *
     * @return
     */
    @RequestMapping(value = "/doDelete/{userid}",method = RequestMethod.DELETE)
    public String doDelete(@PathVariable Integer userid){
        System.out.println("doDelete....");
        return "ok";
    }
    /**
     *
     * @return
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut....");
        return "ok";
    }
}
