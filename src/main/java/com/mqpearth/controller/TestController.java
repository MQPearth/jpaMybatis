package com.mqpearth.controller;

import com.mqpearth.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author mqpearth
 * @date 2021.1.31 21:14
 */
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/jpaSave")
    public void jpaSave() {
        testService.jpaSave();
    }

    @GetMapping("/jpaDelete")

    public void jpaDelete() {
        testService.jpaDelete();
    }

    @GetMapping("/jpaSelect")

    public void jpaSelect() {
        testService.jpaSelect();
    }

    @GetMapping("/mybatisSave")

    public void mybatisSave() {
        testService.mybatisSave();
    }

    @GetMapping("/mybatisDelete")

    public void mybatisDelete() {
        testService.mybatisDelete();
    }

    @GetMapping("/mybatisSelect")
    public void mybatisSelect() {
        testService.mybatisSelect();
    }

    @GetMapping("/mixedDelete")
    public void mixedDelete() {
        testService.mixedDelete();
    }


    @GetMapping("/propagation")
    public void propagation() {
        testService.propagation();
    }

}
