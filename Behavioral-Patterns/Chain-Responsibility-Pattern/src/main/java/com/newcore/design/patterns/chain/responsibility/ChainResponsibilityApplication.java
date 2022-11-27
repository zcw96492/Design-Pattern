package com.newcore.design.patterns.chain.responsibility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 责任链模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class ChainResponsibilityApplication {

    /**
     * 启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(ChainResponsibilityApplication.class,args);
    }
}
