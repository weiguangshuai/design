package com.book.state;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
