package com.newcore.design.patterns.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 矩形实现类
 * @author zhouchaowei
 */
public class Rectangle implements Shapes {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    /**
     * 描绘形状方法
     */
    @Override
    public void draw() {
        logger.info("Rectangle::draw()");
    }
}
