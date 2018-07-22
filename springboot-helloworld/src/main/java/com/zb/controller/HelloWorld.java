package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zb
 * @Date 2018/7/22
 */
@Controller
@ResponseBody
public class HelloWorld {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
