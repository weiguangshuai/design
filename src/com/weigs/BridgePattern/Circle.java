package com.weigs.BridgePattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    protected void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
