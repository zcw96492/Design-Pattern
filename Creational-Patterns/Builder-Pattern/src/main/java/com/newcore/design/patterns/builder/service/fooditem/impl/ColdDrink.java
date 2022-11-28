package com.newcore.design.patterns.builder.service.fooditem.impl;

import com.newcore.design.patterns.builder.service.fooditem.FoodItem;
import com.newcore.design.patterns.builder.service.foodpack.FoodPackage;
import com.newcore.design.patterns.builder.service.foodpack.impl.Bottle;

/**
 * 食物-冷饮
 * @author zhouchaowei
 */
public abstract class ColdDrink implements FoodItem {

    /**
     * 打包食物
     * @return 食物包装
     */
    @Override
    public FoodPackage packing() {
        return new Bottle();
    }

    /**
     * 获取价格
     * @return 价格
     */
    @Override
    public abstract float price();
}
