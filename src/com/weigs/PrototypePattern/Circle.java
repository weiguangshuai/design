package com.weigs.PrototypePattern;

/**
 * @author weigs
 * @date 2017/7/2 0002
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Circle:draw()");
    }
}
