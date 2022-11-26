package com.newcore.design.patterns.command.service;

/**
 * 命令接口(该类为公共命令执行类)
 * @author zhouchaowei
 */
public interface Order {

    /**
     * 执行命令方法
     */
    void execute();
}
