package com.test.guo.controller;

import com.test.guo.entity.MysqlEntity;
import com.test.guo.repository.MysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by guo on 2017/10/11.
 */
@RestController
public class MysqlController {
    @Autowired
    MysqlRepository mysqlRepository;

    @RequestMapping(value = "TestJpa",method = RequestMethod.GET)
    private String find(){
        System.out.println("find...");
        List<MysqlEntity> list = mysqlRepository.findAll();
        for(MysqlEntity entity:list){
            System.out.println("entity:"+entity.getId()+","+entity.getFirstName() + " "+entity.getLastName()+","+entity.getSalary());
        }
        System.out.println("size:"+list.size());
        return "haha";
    }
}
