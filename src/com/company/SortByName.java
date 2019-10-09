package com.company;

import java.util.Comparator;

public class SortByName implements Comparator<Grocery> {
    @Override
    public int compare(Grocery grocery1, Grocery grocery2) {
        return grocery1.getName().compareTo(grocery2.getName());
    }
}
