package com.newcore.design.patterns.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 建造者模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class BuilderPatternApplication {

    /**
     * 启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(BuilderPatternApplication.class,args);
    }
}
