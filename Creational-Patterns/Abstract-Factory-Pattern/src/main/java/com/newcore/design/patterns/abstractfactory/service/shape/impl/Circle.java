package com.newcore.design.patterns.abstractfactory.service.shape.impl;

import com.newcore.design.patterns.abstractfactory.service.shape.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 圆形
 * @author zhouchaowei
 */
public class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    /**
     * 画形状方法
     */
    @Override
    public void draw() {
        logger.info("开始画圆形......");
        logger.info("圆形已画好!");
    }
}
