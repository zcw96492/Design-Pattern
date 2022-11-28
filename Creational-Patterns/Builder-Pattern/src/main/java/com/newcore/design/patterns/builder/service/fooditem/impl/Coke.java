package com.newcore.design.patterns.builder.service.fooditem.impl;

/**
 * 食物-冷饮-可口可乐
 * @author zhouchaowei
 */
public class Coke extends ColdDrink{

    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "可口可乐";
    }

    /**
     * 获取价格
     * @return 价格
     */
    @Override
    public float price() {
        return 30.0f;
    }
}
