package com.newcore.design.patterns.builder.service;

import com.newcore.design.patterns.builder.service.fooditem.impl.ChickenBurger;
import com.newcore.design.patterns.builder.service.fooditem.impl.Coke;
import com.newcore.design.patterns.builder.service.fooditem.impl.Pepsi;
import com.newcore.design.patterns.builder.service.fooditem.impl.VegetableBurger;

/**
 * 菜单方案类
 * @author zhouchaowei
 */
public class MealBuilder {

    /**
     * 素食菜单方案
     * @return 菜单
     */
    public Meal prepareVegetableMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegetableBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 肉食菜单方案
     * @return 菜单
     */
    public Meal prepareNonVegetableMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
