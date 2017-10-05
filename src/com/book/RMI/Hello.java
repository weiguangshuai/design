package com.book.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public interface Hello extends Remote {
    String sayHello(String hello) throws RemoteException;
}
