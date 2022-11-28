package com.newcore.design.patterns.abstractfactory.service.factory.extend;

import com.newcore.design.patterns.abstractfactory.service.color.Color;
import com.newcore.design.patterns.abstractfactory.service.color.impl.Blue;
import com.newcore.design.patterns.abstractfactory.service.color.impl.Green;
import com.newcore.design.patterns.abstractfactory.service.color.impl.Red;
import com.newcore.design.patterns.abstractfactory.service.factory.AbstractFactory;
import com.newcore.design.patterns.abstractfactory.service.shape.Shape;

/**
 * 颜色工厂类
 * @author zhouchaowei
 */
public class ColorFactory extends AbstractFactory {

    /**
     * 获取颜色
     * @param color 颜色
     * @return 颜色
     */
    @Override
    public Color getColor(String color) {
        Color returnColor = null;
        switch (color){
            case "RED" :
                returnColor = new Red();
                break;
            case "GREEN" :
                returnColor = new Green();
                break;
            case "BLUE" :
                returnColor = new Blue();
                break;
            default: break;
        }
        return returnColor;
    }

    /**
     * 获取形状
     * @param shape 形状
     * @return 形状
     */
    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
