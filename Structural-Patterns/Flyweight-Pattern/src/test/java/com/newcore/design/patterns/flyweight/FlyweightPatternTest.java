package com.newcore.design.patterns.flyweight;

import com.newcore.design.patterns.flyweight.service.ShapeFactory;
import com.newcore.design.patterns.flyweight.service.impl.Circle;
import org.junit.jupiter.api.Test;

/**
 * 享元模式测试类
 * @author zhouchaowei
 */
public class FlyweightPatternTest {

    private static final String[] colors = { "红", "绿", "蓝", "白", "黑" };

    @Test
    public void test(){
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    /**
     * 获取随机颜色
     * @return 颜色
     */
    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }

    /**
     * 获取随机横轴
     * @return 横轴
     */
    private static int getRandomX() {
        return (int)(Math.random() * 100 );
    }

    /**
     * 获取随机纵轴
     * @return 纵轴
     */
    private static int getRandomY() {
        return (int)(Math.random() * 100);
    }
}
