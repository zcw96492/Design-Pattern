package com.newcore.design.patterns.bridge;

import com.newcore.design.patterns.bridge.service.Circle;
import com.newcore.design.patterns.bridge.service.Shape;
import com.newcore.design.patterns.bridge.service.impl.GreenCircle;
import com.newcore.design.patterns.bridge.service.impl.RedCircle;
import org.junit.jupiter.api.Test;

/**
 * 桥接模式测试类
 * @author zhouchaowei
 */
public class BridgePatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
