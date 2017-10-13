package com.test.guo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guo on 2017/10/11.
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
//    private final Logger logger2 = Logger.getLogger(this.getClass());

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    private String hello()
    {
        System.out.println("hello...");
        logger.debug("hello slf4j!!!");
        logger.info("File:hello sjf4j!!!");
//        logger2.debug("hello2 log4j!!!");
//        logger2.info("logger2 info!!!");
        return "Hello!";
    }
}
