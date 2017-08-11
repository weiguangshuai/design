package com.weigs.FlyweightPattern;

import java.util.HashMap;

/**
 * @author weigs
 * @date 2017/7/5 0005
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Create circle of color:" + color);
        }

        return circle;
    }
}
