package com.weigs.FlyweightPattern;

/**
 * @author weigs
 * @date 2017/7/5 0005
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle:Draw() [Color:" + color
                + ",x:" + x + ",y:" + y + ",radius:" + radius);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}