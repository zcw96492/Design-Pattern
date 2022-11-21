package com.newcore.design.patterns.factory;

import com.newcore.design.patterns.factory.service.Shapes;
import com.newcore.design.patterns.factory.service.factory.ShapesFactory;
import org.junit.jupiter.api.Test;

/**
 * 工厂模式测试类
 * @author zhouchaowei
 */
public class FactoryPatternTest {

    @Test
    public void testFactoryMethod(){
        ShapesFactory shapesFactory = new ShapesFactory();

        /* 获取 Circle 的对象，并调用它的 draw 方法 */
        Shapes circleShape = shapesFactory.getShape("CIRCLE");
        circleShape.draw();

        /* 获取 Rectangle 的对象，并调用它的 draw 方法 */
        Shapes rectangleShape = shapesFactory.getShape("RECTANGLE");
        rectangleShape.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shapes squareShape = shapesFactory.getShape("SQUARE");
        squareShape.draw();
    }
}
