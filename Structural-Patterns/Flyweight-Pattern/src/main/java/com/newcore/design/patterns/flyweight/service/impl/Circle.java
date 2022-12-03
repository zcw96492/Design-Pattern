package com.newcore.design.patterns.flyweight.service.impl;

import com.newcore.design.patterns.flyweight.service.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 画圆形实现类
 * @author zhouchaowei
 */
public class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    /** 颜色 */
    private String color;

    /** X轴 */
    private int x;

    /** Y轴 */
    private int y;

    /** 半径 */
    private int radius;

    /**
     * 构造器
     * @param color 颜色
     */
    public Circle(String color) {
        this.color = color;
    }

    /**
     * 设置横轴坐标
     * @param x 横轴
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * 设置纵轴坐标
     * @param y 纵轴
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * 设置半径
     * @param radius 半径
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 画形状方法
     */
    @Override
    public void draw() {
        logger.info("开始画圆形:[颜色:{},横轴:{},纵轴:{},半径:{}",color,x,y,radius);
    }
}
