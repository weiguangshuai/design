package com.weigs.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weigs
 * @date 2017/7/1 0001
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item:" + item.name());
            System.out.print(",Packing:" + item.packing().pack());
            System.out.print(",Price:" + item.price());
        }
    }
}
