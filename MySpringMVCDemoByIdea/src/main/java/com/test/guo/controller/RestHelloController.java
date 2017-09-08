package com.test.guo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guo on 2017/9/7.
 */
@RestController
public class RestHelloController {
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public String RestHello(){
        System.out.println("RestHelloController!!!");
        return "hello2";
    }
}
