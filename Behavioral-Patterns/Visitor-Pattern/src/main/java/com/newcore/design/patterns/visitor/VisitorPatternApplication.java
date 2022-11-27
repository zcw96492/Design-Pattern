package com.newcore.design.patterns.visitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 访问者模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class VisitorPatternApplication {

    /**
     * 主启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(VisitorPatternApplication.class,args);
    }
}
