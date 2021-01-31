package com.mqpearth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * com.zzx.Application
 *
 * @author mqpearth
 * @date 2020/11/05 11:13
 */
@MapperScan(basePackages = "com.mqpearth.dao")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
