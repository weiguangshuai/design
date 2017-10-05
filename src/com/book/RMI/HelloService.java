package com.book.RMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class HelloService {
    public static void main(String[] args) {
        try {
            Hello hello = new HelloImpl();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost:1099/hello", hello);
            System.out.println("启动成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
