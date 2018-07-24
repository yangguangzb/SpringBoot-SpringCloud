package com.zb.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @Author zb
 * @Date 2018/7/24
 */
public class LogDemo {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LogDemo.class);
        logger.info("Hello World");
    }

}
