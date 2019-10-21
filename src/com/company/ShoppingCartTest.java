package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {

    @Test
    public void addToCart() {
        Beverage beverageTest1 = new Beverage("Test1",10,10,10);
        ShoppingCart shoppingCart = new ShoppingCart();
        int numberOfGrocerys = shoppingCart.groceryList.size();
        shoppingCart.addToCart(beverageTest1);
        assertEquals(numberOfGrocerys+1,shoppingCart.groceryList.size());
    }
}