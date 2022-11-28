package com.newcore.design.patterns.builder.service.fooditem.impl;

/**
 * 食物-汉堡包-蔬菜汉堡
 * @author zhouchaowei
 */
public class VegetableBurger extends Burger{

    /**
     * 食物名称
     * @return 食物名称
     */
    @Override
    public String name() {
        return "蔬菜汉堡";
    }

    /**
     * 获取价格
     * @return 价格
     */
    @Override
    public float price() {
        return 25.0f;
    }
}
