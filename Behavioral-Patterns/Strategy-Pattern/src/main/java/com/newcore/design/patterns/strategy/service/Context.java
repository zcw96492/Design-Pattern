package com.newcore.design.patterns.strategy.service;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    /**
     * 执行策略结果
     * @param num1 数值1
     * @param num2 数值2
     * @return 运算结果
     */
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
