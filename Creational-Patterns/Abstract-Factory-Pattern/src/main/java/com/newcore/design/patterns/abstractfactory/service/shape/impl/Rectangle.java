package com.newcore.design.patterns.abstractfactory.service.shape.impl;

import com.newcore.design.patterns.abstractfactory.service.shape.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 矩形实现类
 * @author zhouchaowei
 */
public class Rectangle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    /**
     * 画形状方法
     */
    @Override
    public void draw() {
        logger.info("开始画矩形......");
        logger.info("矩形已画好!");
    }
}
