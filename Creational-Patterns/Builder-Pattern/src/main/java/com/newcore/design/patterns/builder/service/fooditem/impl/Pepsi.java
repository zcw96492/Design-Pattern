package com.newcore.design.patterns.builder.service.fooditem.impl;

/**
 * 食物-冷饮-百事可乐
 * @author zhouchaowei
 */
public class Pepsi extends ColdDrink{

    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "百事可乐";
    }

    /**
     * 获取价格
     * @return 价格
     */
    @Override
    public float price() {
        return 35.0f;
    }
}
