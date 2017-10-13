package com.test.guo.entity;

import org.springframework.stereotype.Component;

/**
 * Created by guo on 2017/9/25.
 */
@Component
public class TestAutowiredClass {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
