package com.newcore.design.patterns.decorator.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 红色形状装饰
 * @author zhouchaowei
 */
public class RedShapeDecorator extends ShapeDecorator{

    private static final Logger logger = LoggerFactory.getLogger(RedShapeDecorator.class);

    /**
     * 构造器
     * @param decoratedShape 装饰形状
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    /**
     * 画形状
     */
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 画红色边框
     * @param decoratedShape 装饰形状
     */
    private void setRedBorder(Shape decoratedShape){
        logger.info("开始给{}画红色边框...",decoratedShape);
    }
}
