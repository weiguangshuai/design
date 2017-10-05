package com.book.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class OwnerInvocationHander implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHander(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
//                throw new IllegalAccessException();
                System.out.println("你不能修改");
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
