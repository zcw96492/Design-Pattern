package com.newcore.design.patterns.abstractfactory;

import com.newcore.design.patterns.abstractfactory.service.FactoryProducer;
import com.newcore.design.patterns.abstractfactory.service.color.Color;
import com.newcore.design.patterns.abstractfactory.service.factory.AbstractFactory;
import com.newcore.design.patterns.abstractfactory.service.shape.Shape;
import org.junit.jupiter.api.Test;

/**
 * 抽象工厂模式测试类
 * @author zhouchaowei
 */
public class AbstractFactoryPatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        /* 1.画形状 */
        drawShape();

        /* 2.填颜色 */
        fillColor();
    }

    /**
     * 1.画形状
     */
    private void drawShape(){
        /* 1.获取形状工厂 */
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        /* 2.获取形状为圆形的对象,并画圆形 */
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        circleShape.draw();

        /* 3.获取形状为矩形的对象,并画矩形 */
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        /* 4.获取形状为正方形的对象,并画正方形 */
        Shape squareShape = shapeFactory.getShape("SQUARE");
        squareShape.draw();
    }

    /**
     * 2.填颜色
     */
    private void fillColor(){
        /* 1.获取颜色工厂 */
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        /* 2.获取颜色为红色的对象 */
        Color redColor = colorFactory.getColor("RED");
        redColor.fillColor();

        /* 3.获取颜色为绿色的对象 */
        Color greenColor = colorFactory.getColor("GREEN");
        greenColor.fillColor();

        /* 4.获取颜色为蓝色的对象 */
        Color blueColor = colorFactory.getColor("BLUE");
        blueColor.fillColor();
    }
}
