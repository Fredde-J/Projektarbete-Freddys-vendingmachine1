package com.company;

import java.util.Comparator;

public class SortByPrice implements Comparator<Grocery> {

    @Override
    public int compare(Grocery grocery1, Grocery grocery2) {
        return grocery1.getPrice()-grocery2.getPrice();
    }
}
