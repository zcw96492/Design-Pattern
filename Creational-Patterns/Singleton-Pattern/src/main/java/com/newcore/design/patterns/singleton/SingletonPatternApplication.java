package com.newcore.design.patterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 单例模式工程主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class SingletonPatternApplication {

    /**
     * 主启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SingletonPatternApplication.class);
    }
}
