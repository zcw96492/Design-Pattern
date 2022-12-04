package com.newcore.design.patterns.decorator.service.impl;

import com.newcore.design.patterns.decorator.service.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 圆形实现类
 * @author zhouchaowei
 */
public class Circle implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Circle.class);

    /**
     * 画形状方法
     */
    @Override
    public void draw() {
        logger.info("画圆形......");
    }
}
