package com.weigs.DecoratorPattern;

/**
 * @author weigs
 * @date 2017/7/4 0004
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape:Rectangle");
    }
}
