package com.newcore.design.patterns.prototype.service;

import java.util.Hashtable;

/**
 * 用来存储形状的存储类
 * (该类把Shape对象存储在一个Hashtable中，并在请求的时候返回它们的克隆)
 * @author zhouchaowei
 */
public class ShapeCache {

    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    /**
     * 获取形状方法(原型模式核心方法,返回的是实体对象的克隆)
     * @param shapeId 形状ID
     * @return 形状
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * 加载形状(添加三种形状)
     */
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
