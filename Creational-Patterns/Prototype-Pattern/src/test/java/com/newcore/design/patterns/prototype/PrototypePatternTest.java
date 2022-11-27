package com.newcore.design.patterns.prototype;

import com.newcore.design.patterns.prototype.service.Shape;
import com.newcore.design.patterns.prototype.service.ShapeCache;
import org.junit.jupiter.api.Test;

/**
 * 原型模式测试类
 * @author zhouchaowei
 */
public class PrototypePatternTest {

    /**
     * 测试方法
     */
    @Test
    public void test(){
        /* 1.加载形状 */
        ShapeCache.loadCache();

        /* 2.获取形状 */
        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
