package com.newcore.design.patterns.builder.service.fooditem.impl;

/**
 * 食物-汉堡包-鸡肉汉堡
 * @author zhouchaowei
 */
public class ChickenBurger extends Burger{

    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    /**
     * 获取价格
     *
     * @return 价格
     */
    @Override
    public float price() {
        return 50.5f;
    }
}
