package com.weigs.BuilderPattern;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
