package com.newcore.design.patterns.abstractfactory.service.color.impl;

import com.newcore.design.patterns.abstractfactory.service.color.Color;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 绿色
 * @author zhouchaowei
 */
public class Green implements Color {

    private static final Logger logger = LoggerFactory.getLogger(Green.class);

    /**
     * 填充颜色方法
     */
    @Override
    public void fillColor() {
        logger.info("开始填充绿色......");
    }
}
