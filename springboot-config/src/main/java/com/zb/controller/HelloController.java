package com.zb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zb
 * @Date 2018/7/22
 */
@RestController
public class HelloController {

    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello"+name;
    }

}
