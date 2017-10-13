package com.test.guo.repository;

import com.test.guo.entity.JpaUseMysqlEntity_Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by guo on 2017/9/13.
 */
public interface JpaUseMysqlRepository extends CrudRepository<JpaUseMysqlEntity_Employee,Integer> {
    List<JpaUseMysqlEntity_Employee> findAll();
}
