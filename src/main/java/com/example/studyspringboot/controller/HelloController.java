package com.example.studyspringboot.controller;

import com.example.studyspringboot.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name, String phone) {
        System.out.println("==>" + name + phone);
        return "hello world~~";
    }

    @RequestMapping(value = "/getTest", method = RequestMethod.GET)
    public String getTest() {
        return "测试";
    }

    @RequestMapping(value = "/getTest2", method = RequestMethod.POST)
    public String getTest2(String name) {
        System.out.println(name);
        return "测试";
    }

    @RequestMapping(value = "/getTest3", method = RequestMethod.POST)
    public User getTest3(@RequestBody User user) {
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/test/*", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/test1/**", method = RequestMethod.GET)
    public String test1() {
        return "test1";
    }
}
