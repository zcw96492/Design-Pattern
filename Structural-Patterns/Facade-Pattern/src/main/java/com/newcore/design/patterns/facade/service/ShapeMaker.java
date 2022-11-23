package com.newcore.design.patterns.facade.service;

/**
 * 形状外观类(统一封装画形状的方法)
 * (该类是为降低访问复杂系统的内部子系统时的复杂度,简化客户端与系统之间交互的接口,充当接待员的角色)
 * @author zhouchaowei
 */
public class ShapeMaker {

    private Shapes circle;
    private Shapes rectangle;
    private Shapes square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
