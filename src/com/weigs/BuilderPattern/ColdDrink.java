package com.weigs.BuilderPattern;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
