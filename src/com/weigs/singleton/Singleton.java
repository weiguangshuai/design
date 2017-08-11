package com.weigs.singleton;

/**
 * 登记式/静态内部类
 *
 * @author weigs
 * @date 2017/7/1 0001
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton SINGLETON = new Singleton();
    }

    private Singleton() {
    }

    public static final Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }
}
