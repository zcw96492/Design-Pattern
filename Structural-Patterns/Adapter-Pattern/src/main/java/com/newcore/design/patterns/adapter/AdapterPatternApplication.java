package com.newcore.design.patterns.adapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 适配器模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class AdapterPatternApplication {

    /**
     * 启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(AdapterPatternApplication.class,args);
    }
}
