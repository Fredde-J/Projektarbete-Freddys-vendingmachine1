package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCart {

   public ArrayList<Grocery> groceryList = new ArrayList<>();

    public ShoppingCart() { }

    public void addToCart(Grocery grocery) {
        groceryList.add(grocery);
        Collections.sort(groceryList);
    }

}

