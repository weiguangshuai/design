package com.book.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class HelloImpl extends UnicastRemoteObject implements Hello {

    private static final long serialVersionUID = -2592750465504579866L;

    public HelloImpl() throws RemoteException {

    }

    @Override
    public String sayHello(String hello) throws RemoteException {
        return "service hello" + hello;
    }

}
