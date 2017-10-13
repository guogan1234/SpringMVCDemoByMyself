package com.test.guo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by guo on 2017/9/7.
 */
@Controller
public class HelloController {
//    private final Log log = LogFactory.getLog(this.getClass());

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloSpringMVC(){
        System.out.println("Hello SpringMVC!!!");
//        log.debug("Log:"+"Hello SpringMVC!!!");
        return "hello";
    }
}
