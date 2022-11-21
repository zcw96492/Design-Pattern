package com.newcore.design.patterns.factory.service.impl;

import com.newcore.design.patterns.factory.service.Shapes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 形状接口-长方形实现类
 * @author zhouchaowei
 */
public class Rectangle implements Shapes {

    private static final Logger logger = LoggerFactory.getLogger(Rectangle.class);

    /**
     * 描绘形状方法
     */
    @Override
    public void draw() {
        logger.info("开始描绘长方形......");
    }
}
