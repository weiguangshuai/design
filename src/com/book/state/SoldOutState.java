package com.book.state;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert a quarter,the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can't eject,you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned , but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }

    @Override
    public String toString() {
        return "sold out";
    }


}
