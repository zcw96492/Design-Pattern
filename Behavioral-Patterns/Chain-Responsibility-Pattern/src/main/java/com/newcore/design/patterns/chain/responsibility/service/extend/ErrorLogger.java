package com.newcore.design.patterns.chain.responsibility.service.extend;

import com.newcore.design.patterns.chain.responsibility.service.AbstractLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 错误日志类
 * @author zhouchaowei
 */
public class ErrorLogger extends AbstractLogger {

    private static final Logger logger = LoggerFactory.getLogger(ErrorLogger.class);

    public ErrorLogger(int level){
        this.level = level;
    }

    /**
     * 记录消息方法
     * @param message 消息
     */
    @Override
    protected void write(String message) {
        logger.info("Error Console::Logger:{}" ,message);
    }
}
