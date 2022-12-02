package com.newcore.design.patterns.bridge.service;

/**
 * 形状抽象类
 * @author zhouchaowei
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    /**
     * 构造器
     * @param drawAPI 绘画接口
     */
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    /**
     * 画画方法
     */
    public abstract void draw();
}
