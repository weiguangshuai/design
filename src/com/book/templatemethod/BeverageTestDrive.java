package com.book.templatemethod;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @author weigs
 * @date 2017/10/2 0002
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tee tee = new Tee();
        tee.brew();
        Coffee coffee = new Coffee();
        coffee.customerWantsCondiments();

        System.out.println("\nMaking tee");
        tee.prepareRecipe();


        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }
}
