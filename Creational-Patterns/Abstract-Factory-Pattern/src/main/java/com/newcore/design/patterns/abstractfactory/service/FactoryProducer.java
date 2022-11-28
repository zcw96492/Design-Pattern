package com.newcore.design.patterns.abstractfactory.service;

import com.newcore.design.patterns.abstractfactory.service.factory.AbstractFactory;
import com.newcore.design.patterns.abstractfactory.service.factory.extend.ColorFactory;
import com.newcore.design.patterns.abstractfactory.service.factory.extend.ShapeFactory;

/**
 * 工厂创造器/生成器类(通过传递形状或颜色信息来获取工厂)
 * @author zhouchaowei
 */
public class FactoryProducer {

    /**
     * 获取工厂
     * @param factoryName 工厂名称
     * @return 具体工厂
     */
    public static AbstractFactory getFactory(String factoryName){
        AbstractFactory factory = null;
        switch (factoryName){
            case "SHAPE" :
                factory = new ShapeFactory();
                break;
            case "COLOR" :
                factory = new ColorFactory();
                break;
            default:break;
        }
        return factory;
    }
}
