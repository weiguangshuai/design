package com.book.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class DynamicProxy implements InvocationHandler {
    Person student;

    public DynamicProxy(Person person) {
        this.student = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先执行人的动作");
        method.invoke(student, args);
        System.out.println("执行完人的动作");
        return null;
    }
}
