package com.newcore.design.patterns.builder.service.fooditem;

import com.newcore.design.patterns.builder.service.foodpack.FoodPackage;

/**
 * 食物条目
 * @author zhouchaowei
 */
public interface FoodItem {

    /**
     * 食物名称
     * @return 食物名称
     */
    String name();

    /**
     * 打包食物
     * @return 食物包装
     */
    FoodPackage packing();

    /**
     * 获取价格
     * @return 价格
     */
    float price();
}
