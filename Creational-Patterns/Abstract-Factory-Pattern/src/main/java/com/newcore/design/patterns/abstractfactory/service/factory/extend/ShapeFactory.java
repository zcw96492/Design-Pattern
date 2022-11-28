package com.newcore.design.patterns.abstractfactory.service.factory.extend;

import com.newcore.design.patterns.abstractfactory.service.color.Color;
import com.newcore.design.patterns.abstractfactory.service.factory.AbstractFactory;
import com.newcore.design.patterns.abstractfactory.service.shape.Shape;
import com.newcore.design.patterns.abstractfactory.service.shape.impl.Circle;
import com.newcore.design.patterns.abstractfactory.service.shape.impl.Rectangle;
import com.newcore.design.patterns.abstractfactory.service.shape.impl.Square;

/**
 * 形状工厂类
 * @author zhouchaowei
 */
public class ShapeFactory extends AbstractFactory {

    /**
     * 获取颜色
     * @param color 颜色
     * @return 颜色
     */
    @Override
    public Color getColor(String color) {
        return null;
    }

    /**
     * 获取形状
     * @param shape 形状
     * @return 形状
     */
    @Override
    public Shape getShape(String shape) {
        Shape returnShape = null;
        switch (shape){
            case "CIRCLE" :
                returnShape = new Circle();
                break;
            case "RECTANGLE" :
                returnShape = new Rectangle();
                break;
            case "SQUARE" :
                returnShape = new Square();
                break;
            default: break;
        }
        return returnShape;
    }
}
