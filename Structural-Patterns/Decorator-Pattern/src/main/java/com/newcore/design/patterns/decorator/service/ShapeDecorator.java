package com.newcore.design.patterns.decorator.service;

/**
 * 形状装饰类(这是个抽象类)
 * @author zhouchaowei
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    /**
     * 构造器
     * @param decoratedShape 装饰形状
     */
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    /**
     * 画形状
     */
    public void draw(){
        decoratedShape.draw();
    }
}
