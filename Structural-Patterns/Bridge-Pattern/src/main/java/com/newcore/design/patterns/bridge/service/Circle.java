package com.newcore.design.patterns.bridge.service;

public class Circle extends Shape{

    private final int x;
    private final int  y;
    private final int  radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     * 画画方法
     */
    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
