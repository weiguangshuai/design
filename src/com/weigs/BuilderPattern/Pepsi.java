package com.weigs.BuilderPattern;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
