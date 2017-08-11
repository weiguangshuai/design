package com.book.decorator;

/**
 * @author weigs
 * @date 2017/8/9 0009
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "house blend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
