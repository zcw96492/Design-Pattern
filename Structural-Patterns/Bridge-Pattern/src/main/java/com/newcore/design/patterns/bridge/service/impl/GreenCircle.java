package com.newcore.design.patterns.bridge.service.impl;

import com.newcore.design.patterns.bridge.service.DrawAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 画绿颜色圈实现类
 * @author zhouchaowei
 */
public class GreenCircle implements DrawAPI {

    private static final Logger logger = LoggerFactory.getLogger(GreenCircle.class);

    /**
     * 画圆方法
     * @param radius 半径
     * @param x      坐标横轴
     * @param y      坐标纵轴
     */
    @Override
    public void drawCircle(int radius, int x, int y) {
        logger.info("[颜色:绿色;半径:{},横轴:{},纵轴:{}]",radius,x,y);
    }
}
