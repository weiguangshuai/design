package com.book.command.part;

/**
 * @author weigs
 * @date 2017/9/16 0016
 */
public interface Command {

    public void execute();

    public void undo();

}
