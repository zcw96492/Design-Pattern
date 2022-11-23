package com.newcore.design.patterns.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 外观模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class FacadePatternApplication {

    /**
     * 主启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(FacadePatternApplication.class,args);
    }
}
