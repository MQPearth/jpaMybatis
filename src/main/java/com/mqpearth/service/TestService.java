package com.mqpearth.service;

import com.mqpearth.dao.InfoMapper;
import com.mqpearth.dao.InfoRepository;
import com.mqpearth.domain.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * TestService
 *
 * @author mqpearth
 * @date 2021.1.31 21:18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestService {
    @Autowired
    InfoMapper infoMapper;

    @Autowired
    InfoRepository infoRepository;

    @Autowired
    TestService testService;


    public void jpaSave() {
        infoRepository.save(new Info(null, "张三", "123456"));
    }

    public void jpaDelete() {
        infoRepository.deleteByName("张三");
        // mock exception
        int i = 1 / 0;
    }

    public void jpaSelect() {
        System.out.println(infoRepository.findByName("张三"));
    }

    public void mybatisSave() {
        infoMapper.save(new Info(null, "张三", "123456"));
    }

    public void mybatisDelete() {
        infoMapper.deleteByName("张三");
        int i = 1 / 0;

    }


    public void mybatisSelect() {
        System.out.println(infoMapper.findByName("张三"));
    }

    /**
     * 事务管理器测试
     */
    public void mixedDelete() {
        infoMapper.deleteByName("张三");
        infoRepository.deleteByName("李四");
        int i = 1 / 0;

    }

    /**
     * 事务传播测试
     */
    public void propagation() {
        testService.jpaDelete();
        testService.mybatisDelete();


        int i = 1 / 0;
    }

}
