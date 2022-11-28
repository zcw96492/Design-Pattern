package com.newcore.design.patterns.abstractfactory.service.factory;

import com.newcore.design.patterns.abstractfactory.service.color.Color;
import com.newcore.design.patterns.abstractfactory.service.shape.Shape;

/**
 * 抽象工厂类(核心代码)
 * @author zhouchaowei
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色
     * @param color 颜色
     * @return 颜色
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     * @param shape 形状
     * @return 形状
     */
    public abstract Shape getShape(String shape);
}
