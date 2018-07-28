package com.zb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author zb
 * @Date 2018/7/28
 */
//使用WebMvcConfigurerAdapter可以扩展SpringMVC的功功能
//@EnableWebMvc 不要接管SpringMVC(不推荐使用)
@Configuration  //表示这是一个配置类
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        //浏览器发送/zhang 请求来到success
        registry.addViewController("/zhang").setViewName("success");
    }

}
