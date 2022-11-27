package com.newcore.design.patterns.chain.responsibility.service.extend;

import com.newcore.design.patterns.chain.responsibility.service.AbstractLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 控制台日志类
 * @author zhouchaowei
 */
public class ConsoleLogger extends AbstractLogger {

    private static final Logger logger = LoggerFactory.getLogger(ConsoleLogger.class);

    public ConsoleLogger(int level){
        this.level = level;
    }

    /**
     * 记录消息方法
     * @param message 消息
     */
    @Override
    protected void write(String message) {
        logger.info("Standard Console::Logger:{}" ,message);
    }
}
