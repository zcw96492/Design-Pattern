package com.newcore.design.patterns.strategy.service;

/**
 * 运算策略接口
 * @author zhouchaowei
 */
public interface Strategy {

    /**
     * 运算方法
     * @param num1 数值1
     * @param num2 数值2
     * @return 运算结果
     */
    int doOperation(int num1, int num2);
}
