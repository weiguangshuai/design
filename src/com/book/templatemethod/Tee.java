package com.book.templatemethod;

/**
 * @author weigs
 * @date 2017/10/2 0002
 */
public class Tee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
