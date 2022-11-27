package com.newcore.design.patterns.chain.responsibility.service;

/**
 * 记录器抽象类
 * @author zhouchaowei
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    /* 责任链中的下一个元素 */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    /**
     *
     * @param level 日志级别
     * @param message 消息
     */
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 记录消息方法
     * @param message 消息
     */
    abstract protected void write(String message);
}
