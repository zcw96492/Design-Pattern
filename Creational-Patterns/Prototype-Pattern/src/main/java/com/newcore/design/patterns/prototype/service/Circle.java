package com.newcore.design.patterns.prototype.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 圆形扩展类
 * @author zhouchaowei
 */
public class Circle extends Shape{

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    public Circle() {
        type = "Circle";
    }

    /**
     * 画形状的抽象方法
     */
    @Override
    void draw() {
        logger.info("Inside Circle::draw() method.");
    }
}
