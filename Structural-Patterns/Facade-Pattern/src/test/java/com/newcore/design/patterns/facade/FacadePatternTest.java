package com.newcore.design.patterns.facade;

import com.newcore.design.patterns.facade.service.ShapeMaker;
import org.junit.jupiter.api.Test;

/**
 * 外观模式测试类
 * @author zhouchaowei
 */
public class FacadePatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
