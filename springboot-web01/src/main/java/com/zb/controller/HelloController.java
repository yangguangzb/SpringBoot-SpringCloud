package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author zb
 * @Date 2018/7/28
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/success")
    public String success(Map<String , Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users",Arrays.asList("张三","李四","王五"));
        return "success";
    }

}
