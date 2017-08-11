package com.weigs.BuilderPattern;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.3f;
    }
}
