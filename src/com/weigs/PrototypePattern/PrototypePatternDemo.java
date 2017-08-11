package com.weigs.PrototypePattern;

/**
 * @author weigs
 * @date 2017/7/2 0002
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("3");
        System.out.println(clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("2");
        System.out.println(clonedShape3.getType());
        clonedShape3.draw();

    }
}
