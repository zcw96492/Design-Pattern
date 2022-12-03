package com.newcore.design.patterns.flyweight.service;

import com.newcore.design.patterns.flyweight.service.impl.Circle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * 享元模式核心代码:形状工厂类(生成基于给定信息的实体类的对象)
 * @author zhouchaowei
 */
public class ShapeFactory {

    private static final Logger logger = LoggerFactory.getLogger(ShapeFactory.class);

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    /**
     * 获取圆形
     * @param color 颜色
     * @return 形状
     */
    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            logger.info("创建{}颜色的圆形",color);
        }
        return circle;
    }
}
