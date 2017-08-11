package com.weigs.PrototypePattern;

/**
 * @author weigs
 * @date 2017/7/2 0002
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangel";
    }

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
