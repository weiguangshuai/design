package com.weigs.PrototypePattern;

/**
 * @author weigs
 * @date 2017/7/2 0002
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
