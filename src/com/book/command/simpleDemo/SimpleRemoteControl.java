package com.book.command.simpleDemo;

import com.book.command.simpleDemo.Command;

/**
 * @author weigs
 * @date 2017/9/15 0015
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
