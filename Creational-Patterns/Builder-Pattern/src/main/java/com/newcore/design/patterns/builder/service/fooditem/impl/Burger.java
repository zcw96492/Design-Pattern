package com.newcore.design.patterns.builder.service.fooditem.impl;

import com.newcore.design.patterns.builder.service.fooditem.FoodItem;
import com.newcore.design.patterns.builder.service.foodpack.FoodPackage;
import com.newcore.design.patterns.builder.service.foodpack.impl.Wrapper;

/**
 * 食物-汉堡包
 * @author zhouchaowei
 */
public abstract class Burger implements FoodItem {

    /**
     * 打包食物
     * @return 食物包装
     */
    @Override
    public FoodPackage packing() {
        return new Wrapper();
    }

    /**
     * 获取价格
     * @return 价格
     */
    @Override
    public abstract float price();
}
