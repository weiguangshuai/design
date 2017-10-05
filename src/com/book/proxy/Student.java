package com.book.proxy;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class Student implements Person {
    @Override
    public void eat() {
        System.out.println("weigs eat");
    }

    @Override
    public void sleep() {
        System.out.println("weigs sleep");
    }
}
