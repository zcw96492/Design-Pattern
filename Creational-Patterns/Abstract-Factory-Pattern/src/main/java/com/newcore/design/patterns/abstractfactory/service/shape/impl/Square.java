package com.newcore.design.patterns.abstractfactory.service.shape.impl;

import com.newcore.design.patterns.abstractfactory.service.shape.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正方形
 * @author zhouchaowei
 */
public class Square implements Shape {

    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    /**
     * 画形状方法
     */
    @Override
    public void draw() {
        logger.info("开始画正方形......");
        logger.info("正方形已画好!");
    }
}
