package com.newcore.design.patterns.bridge.service;

/**
 * 绘画接口
 * @author zhouchaowei
 */
public interface DrawAPI {

    /**
     * 画圆方法
     * @param radius 半径
     * @param x 坐标横轴
     * @param y 坐标纵轴
     */
    void drawCircle(int radius, int x, int y);
}
