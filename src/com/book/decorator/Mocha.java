package com.book.decorator;

/**
 * 装饰者
 *
 * @author weigs
 * @date 2017/8/9 0009
 */
public class Mocha extends CodimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
