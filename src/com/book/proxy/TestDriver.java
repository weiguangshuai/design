package com.book.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class TestDriver {
    public static void main(String[] args) {
        PersonBean personBean1 = new PersonBeanImpl();
        PersonBean personBean2 = new PersonBeanImpl();

        InvocationHandler invocationHandler1 =
                new NonOwnerInvocationHandler(personBean1);
        InvocationHandler invocationHandler2 =
                new OwnerInvocationHander(personBean2);

        PersonBean proxy1 = (PersonBean) Proxy.newProxyInstance(invocationHandler1.getClass().getClassLoader(),
                personBean1.getClass().getInterfaces(), invocationHandler1);
        System.out.println("proxy1----------------");
        proxy1.setGender("nan");
        proxy1.setHotOrNotRating(1);

        PersonBean proxy2 = (PersonBean) Proxy.newProxyInstance(invocationHandler2.getClass().getClassLoader(),
                personBean2.getClass().getInterfaces(), invocationHandler2);
        System.out.println("proxy2-----------------");
        proxy2.setGender("nv");
        proxy2.setHotOrNotRating(2);


    }
}
