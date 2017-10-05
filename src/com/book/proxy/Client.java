package com.book.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class Client {
    public static void main(String[] args) {
        Person person = new Student();
        InvocationHandler invocationHandler = new DynamicProxy(person);
        Person student = (Person) Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(),
                person.getClass().getInterfaces(), invocationHandler);
        student.eat();
        student.sleep();
    }
}
