package com.book.command.part;

import java.util.Iterator;

/**
 * @author weigs
 * @date 2017/10/2 0002
 */
public class Client {
    private Command command;

    public Client(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

    public static void main(String[] args) {
        Client client = new Client(new LightOffCommand(new Light("weigs")));
        client.action();
    }
}
