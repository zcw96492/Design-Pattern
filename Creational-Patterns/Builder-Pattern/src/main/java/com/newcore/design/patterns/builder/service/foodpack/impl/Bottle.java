package com.newcore.design.patterns.builder.service.foodpack.impl;

import com.newcore.design.patterns.builder.service.foodpack.FoodPackage;

/**
 * 包装材料-瓶子
 * @author zhouchaowei
 */
public class Bottle implements FoodPackage {

    /**
     * 食物包装
     * @return 打包
     */
    @Override
    public String pack() {
        return "玻璃瓶包装";
    }
}
