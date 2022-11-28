package com.newcore.design.patterns.builder;

import com.newcore.design.patterns.builder.service.Meal;
import com.newcore.design.patterns.builder.service.MealBuilder;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 建造者模式测试类
 * @author zhouchaowei
 */
public class BuilderPatternsTest {

    private static final Logger logger = LoggerFactory.getLogger(BuilderPatternsTest.class);

    /**
     * 测试方法
     */
    @Test
    public void test(){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegetableMeal = mealBuilder.prepareVegetableMeal();
        logger.info(" 订单1-素食菜单:");
        logger.info(" -------------------");
        vegetableMeal.showItems();
        logger.info(" -------------------");
        logger.info(" 共计花费:{}" , vegetableMeal.getCost());
        logger.info(" ***************************************");
        Meal nonVegetableMeal = mealBuilder.prepareNonVegetableMeal();
        logger.info(" 订单2-肉食菜单:");
        logger.info(" -------------------");
        nonVegetableMeal.showItems();
        logger.info(" -------------------");
        logger.info(" 共计花费:{}" , nonVegetableMeal.getCost());
    }
}
