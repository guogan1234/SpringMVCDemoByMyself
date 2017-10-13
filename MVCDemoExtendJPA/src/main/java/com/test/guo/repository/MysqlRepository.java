package com.test.guo.repository;

import com.test.guo.entity.MysqlEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by guo on 2017/10/11.
 */
public interface MysqlRepository extends CrudRepository<MysqlEntity,Integer>{
    List<MysqlEntity> findAll();
}
