package com.newcore.design.patterns.decorator;

import com.newcore.design.patterns.decorator.service.RedShapeDecorator;
import com.newcore.design.patterns.decorator.service.Shape;
import com.newcore.design.patterns.decorator.service.ShapeDecorator;
import com.newcore.design.patterns.decorator.service.impl.Circle;
import com.newcore.design.patterns.decorator.service.impl.Rectangle;
import org.junit.jupiter.api.Test;

/**
 * 装饰器模式主启动类
 * @author zhouchaowei
 */
public class DecoratorPatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        redCircle.draw();
        redRectangle.draw();
    }
}
