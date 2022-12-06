package com.newcore.design.patterns.strategy.service;

/**
 * 乘操作实现类
 * @author zhouchaowei
 */
public class OperationMultiply implements Strategy{

    /**
     * 运算方法
     * @param num1 数值1
     * @param num2 数值2
     * @return 运算结果
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
