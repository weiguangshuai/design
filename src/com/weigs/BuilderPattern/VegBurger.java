package com.weigs.BuilderPattern;

/**
 * 创建扩展了Burger的实体类
 * @author weigs
 * @date 2017/7/1 0001
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
