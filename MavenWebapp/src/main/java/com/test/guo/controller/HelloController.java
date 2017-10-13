package com.test.guo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guo on 2017/10/11.
 */
@RestController
public class HelloController {
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    private String hello(){
        return "hello";
    }
}
