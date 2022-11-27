package com.newcore.design.patterns.chain.responsibility.service.extend;

import com.newcore.design.patterns.chain.responsibility.service.AbstractLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 文件日志类
 * @author zhouchaowei
 */
public class FileLogger extends AbstractLogger {

    private static final Logger logger = LoggerFactory.getLogger(FileLogger.class);

    public FileLogger(int level){
        this.level = level;
    }

    /**
     * 记录消息方法
     * @param message 消息
     */
    @Override
    protected void write(String message) {
        logger.info("File Console::Logger:{}" ,message);
    }
}
