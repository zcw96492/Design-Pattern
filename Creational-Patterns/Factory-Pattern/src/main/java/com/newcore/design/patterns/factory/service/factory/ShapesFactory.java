package com.newcore.design.patterns.factory.service.factory;

import com.newcore.design.patterns.factory.service.Shapes;
import com.newcore.design.patterns.factory.service.impl.Circle;
import com.newcore.design.patterns.factory.service.impl.Rectangle;
import com.newcore.design.patterns.factory.service.impl.Square;

/**
 * 形状工厂类-用来获取各式各样的形状
 * @author zhouchaowei
 */
public class ShapesFactory {

    /**
     * 获取形状
     * @param shapeType 形状类型
     * @return 形状对象
     */
    public Shapes getShape(String shapeType){
        if(shapeType == null){
            return null;
        }else{
            if(shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();
            } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
                return new Rectangle();
            } else if(shapeType.equalsIgnoreCase("SQUARE")){
                return new Square();
            }else {
                return null;
            }
        }
    }
}
