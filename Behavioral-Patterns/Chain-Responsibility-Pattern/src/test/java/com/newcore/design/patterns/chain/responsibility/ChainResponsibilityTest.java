package com.newcore.design.patterns.chain.responsibility;

import com.newcore.design.patterns.chain.responsibility.service.AbstractLogger;
import com.newcore.design.patterns.chain.responsibility.service.extend.ConsoleLogger;
import com.newcore.design.patterns.chain.responsibility.service.extend.ErrorLogger;
import com.newcore.design.patterns.chain.responsibility.service.extend.FileLogger;
import org.junit.jupiter.api.Test;

/**
 * 责任链测试类
 * @author zhouchaowei
 */
public class ChainResponsibilityTest {

    /**
     *
     * @return
     */
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        /* 责任链的体现 */
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    @Test
    public void test(){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}