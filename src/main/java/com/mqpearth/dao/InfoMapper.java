package com.mqpearth.dao;

import com.mqpearth.domain.Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoMapper {

    /**
     * 自定义添加通过用户名称模糊查找用户信息
     */
    List<Info> findByName(String name);

    /**
     * deleteByName
     * @param name
     * @return
     */
    Integer deleteByName(String name);

    void save(Info info);

}