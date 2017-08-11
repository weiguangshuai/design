package com.weigs.BridgePattern;

/**
 * @author weigs
 * @date 2017/7/3 0003
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle =
                new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle =
                new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
