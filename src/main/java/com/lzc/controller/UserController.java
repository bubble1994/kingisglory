package com.lzc.controller;

import com.lzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liuzhichao
 * @Date: 2020/6/24 20:36
 * @Description:
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    public  static int i = 0;

    @RequestMapping("/hello")
    public String hello() {
        i++;
        return "hello " + i;
    }


    @RequestMapping("/hello2")
    public String hello2() {
        i++;
        return "hello 是假的啦 " + i;
    }

    @RequestMapping("/getUser")
    public String getUser() {
        i++;

        return userService.getUser() + i;
    }
}