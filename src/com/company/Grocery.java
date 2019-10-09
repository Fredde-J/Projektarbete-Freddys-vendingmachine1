package com.company;

import java.io.Serializable;

public abstract class Grocery implements Comparable<Grocery>, Serializable {
    private String name = "";
    private int price = 0;
    private int sort = 0;

    Grocery(String name, int price, int sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSort() {
        return sort;
    }

    public abstract int compareTo(Grocery grocery);

    public abstract String toString();
}
