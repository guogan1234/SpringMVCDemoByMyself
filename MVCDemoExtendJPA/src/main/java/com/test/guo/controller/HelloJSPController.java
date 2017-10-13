package com.test.guo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by guo on 2017/10/13.
 */
@Controller
public class HelloJSPController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "helloJSP",method = RequestMethod.GET)
    private String helloJSP(){
        logger.info("helloJSP!!!");
        return "hello";
    }
}
