package com.book.templatemethod;

import java.util.Scanner;

/**
 * @author weigs
 * @date 2017/10/2 0002
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Suger and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer == null)
            return "no";
        return answer;
    }
}
