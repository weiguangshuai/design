package com.weigs.singleton;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class SingleObjectTest {
    public static void main(String[] args) {
        SingleObject singleObject1 = SingleObject.getSingleObject();
        SingleObject singleObject2 = SingleObject.getSingleObject();
        if (singleObject1 == singleObject2) {
            System.out.println("相同");
        }
    }
}
