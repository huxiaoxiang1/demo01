package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: huxiaoxiang.
 * @ClassName: HelloCotroller
 * @Date: 2019/4/10 9:28
 * @Version: 1.0.0
 * @Description:
 */

@RestController
public class HelloCotroller {
    @RequestMapping(value = "hello")
    public String hello(){
        return "hello";
    }
}
