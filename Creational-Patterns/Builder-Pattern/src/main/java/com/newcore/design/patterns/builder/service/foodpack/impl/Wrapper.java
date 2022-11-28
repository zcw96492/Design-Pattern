package com.newcore.design.patterns.builder.service.foodpack.impl;

import com.newcore.design.patterns.builder.service.foodpack.FoodPackage;

/**
 * 包装材料-包装纸
 * @author zhouchaowei
 */
public class Wrapper implements FoodPackage {

    /**
     * 食物包装
     * @return 打包
     */
    @Override
    public String pack() {
        return "锡纸包装";
    }
}
