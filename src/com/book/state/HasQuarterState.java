package com.book.state;

/**
 * @author weigs
 * @date 2017/10/5 0005
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned ...");
        gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
