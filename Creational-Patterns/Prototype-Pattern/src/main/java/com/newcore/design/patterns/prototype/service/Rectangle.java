package com.newcore.design.patterns.prototype.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 矩形扩展类
 * @author zhouchaowei
 */
public class Rectangle extends Shape{

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    public Rectangle(){
        type = "Rectangle";
    }

    /**
     * 画形状的抽象方法
     */
    @Override
    void draw() {
        logger.info("Inside Rectangle::draw() method.");
    }
}
