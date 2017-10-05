package com.book.command.simpleDemo;

import com.book.command.simpleDemo.Command;
import com.book.command.simpleDemo.Light;

/**
 * @author weigs
 * @date 2017/9/15 0015
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
