package com.test.guo.controller;

import com.test.guo.entity.JpaUseMysqlEntity_Employee;
import com.test.guo.entity.TestAutowiredClass;
import com.test.guo.repository.JpaUseMysqlRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guo on 201713.
 */
@RestController
public class JpaUseMysqlController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    JpaUseMysqlRepository jpaUseMysqlRepository;

    @Autowired
    TestAutowiredClass testAutowiredClass;

    @RequestMapping(value = "TestJpa",method = RequestMethod.GET)
    void TestJpa(){
        System.out.println("TestJpa...");
        logger.debug("TestJpa2...");
        List<JpaUseMysqlEntity_Employee> list = jpaUseMysqlRepository.findAll();
        logger.debug("len:{}",list.size());
        System.out.println("len:"+list.size());
    }

    @RequestMapping(value = "TestAutowired",method = RequestMethod.GET)
    void TestAutowired(){
        System.out.println("TestAutowired...");
        logger.debug("logger:TestAutowired...");
        testAutowiredClass.setName("haha");
        testAutowiredClass.setAge(11);
    }
}
