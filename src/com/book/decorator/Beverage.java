package com.book.decorator;

/**
 * @author weigs
 * @date 2017/8/9 0009
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
