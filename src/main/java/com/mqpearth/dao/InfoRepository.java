package com.mqpearth.dao;

import com.mqpearth.domain.Info;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InfoRepository extends CrudRepository<Info, Integer> {
    /**
     * 自定义添加通过用户名称模糊查找用户信息
     */
    List<Info> findByName(String name);

    void deleteByName(String name);
}