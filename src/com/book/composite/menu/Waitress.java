package com.book.composite.menu;

/**
 * @author weigs
 * @date 2017/10/4 0004
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

}
