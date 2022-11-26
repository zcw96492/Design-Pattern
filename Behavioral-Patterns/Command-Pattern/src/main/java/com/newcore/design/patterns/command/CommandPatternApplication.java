package com.newcore.design.patterns.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 命令模式主启动类
 * @author zhouchaowei
 */
@SpringBootApplication
public class CommandPatternApplication {

    /**
     * 主启动方法
     * @param args 启动参数
     */
    public static void main(String[] args) {
        SpringApplication.run(CommandPatternApplication.class,args);
    }
}
