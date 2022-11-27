package com.newcore.design.patterns.prototype.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正方形扩展类
 * @author zhouchaowei
 */
public class Square extends Shape{

    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    public Square() {
        type = "Square";
    }

    /**
     * 画形状的抽象方法
     */
    @Override
    void draw() {
        logger.info("Inside Square::draw() method.");
    }
}
