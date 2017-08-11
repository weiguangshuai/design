package com.book.decorator;

/**
 * @author weigs
 * @date 2017/8/9 0009
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "$"
                + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + "$"
                + beverage1.cost());
    }
}
