package com.newcore.design.patterns.facade.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 正方形实现类
 * @author zhouchaowei
 */
public class Square implements Shapes{

    private static final Logger logger = LoggerFactory.getLogger(Square.class);

    /**
     * 描绘形状方法
     */
    @Override
    public void draw() {
        logger.info("Square::draw()");
    }
}
