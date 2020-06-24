package com.lzc.kingisglory.user;

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
}