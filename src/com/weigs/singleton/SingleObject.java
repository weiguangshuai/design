package com.weigs.singleton;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class SingleObject {
    //创建一个SingleObject对象
    private static SingleObject singleObject = new SingleObject();

    //让构造函数为private，这样类就不会被实例化
    private SingleObject() {

    }

    //获取唯一可用对象
    public static SingleObject getSingleObject() {
        return singleObject;
    }

}
