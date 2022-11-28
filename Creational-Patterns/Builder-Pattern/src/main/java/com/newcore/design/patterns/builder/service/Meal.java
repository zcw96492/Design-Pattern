package com.newcore.design.patterns.builder.service;

import com.newcore.design.patterns.builder.service.fooditem.FoodItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 食物点单类
 * @author zhouchaowei
 */
public class Meal {

    private static final Logger logger = LoggerFactory.getLogger(Meal.class);

    /** 食物菜单列表 */
    private final List<FoodItem> foodItemList = new ArrayList<>();

    /**
     * 点单方法
     * @param item 食物条目
     */
    public void addItem(FoodItem item){
        foodItemList.add(item);
    }

    /**
     * 获取账单花销
     * @return 金额
     */
    public float getCost(){
        float cost = 0.0f;
        for (FoodItem item : foodItemList) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * 展示菜单(打印菜单)
     */
    public void showItems(){
        for (FoodItem item : foodItemList) {
            logger.info("菜品名称:{} | 包装:{} | 价格:{}",item.name(),item.packing().pack(),item.price());
        }
    }
}
