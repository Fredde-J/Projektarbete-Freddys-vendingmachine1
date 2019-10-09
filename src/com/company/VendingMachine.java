package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private String nameOfVendingMachine = "";
    public Scanner scanner = new Scanner(System.in);
    private double money = 100;
    private int sum = 0;
    private String choice = "";
    ShoppingCart shoppingCart = new ShoppingCart();

    public VendingMachine(String nameOfVendingMachine) {
        this.nameOfVendingMachine = nameOfVendingMachine;
    }

    public void showMainMenu() {
        String menuChoice ="";
        do {
            System.out.printf("[Welcome to %s] \n", nameOfVendingMachine);
            System.out.println("------------------------------------");
            System.out.println("Please choose a alternative below");
            System.out.println("1.Add food");
            System.out.println("2.Add Beverage");
            System.out.println("3.Show shopping cart");
            System.out.println("4.Remove item from shopping cart");
            System.out.println("5.Save your grocery's to a file");
            System.out.println("6.Import grocery's from file");
            System.out.println("7.Exit program");

            menuChoice= scanner.next();

            switch (menuChoice) {
                case "1":
                    addFood();
                    break;
                case "2":
                    addBeverage();
                    break;
                case "3":
                    showShoppingCart();
                    break;
                case "4":
                    removeItemFromShoppingCart();
                    break;
                case "5":
                    Receipt.makeReceiptFile();
                    System.out.println("Your shopping cart have been saved to file");
                    break;
                case "6":
                    shoppingCart.groceryList= (ArrayList<Grocery>) Receipt.copyReceipt("receiptFile.ser");
                    System.out.println("Grocery's from file have been added to you shopping cart");
                    break;
                case "7":
                    System.out.println("Thanks for the visit, have a nice day!");
                    break;
                default:
                    System.out.println("Wrong input! please try again.");
                    break;
            }
        } while (!menuChoice.equals("7"));
    }

    public void addFood() {
        boolean bool = true;

        while (money > 10 && bool) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Press 1-6 to add food to your shopping cart. press 0 to go back to mainmenu");
            System.out.println("1.SWEBAR Strawberry proteinbar                 10kr");
            System.out.println("2.BAREBELLS Cookies and cream proteinbar       13kr");
            System.out.println("3.CORE chocolate proteinbar                    15kr");
            System.out.println("4.OLW sourcream and onion chips                18kr");
            System.out.println("5.LAYS salted chips                            15kr");
            System.out.println("6.DORITOS chili cornchips                      20kr");
            System.out.println("0.Go to Main menu");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Money left in you wallet: " + money + "kr");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    ProteinBar sweBar = new ProteinBar("SWEBAR Strawberry proteinbar", 10, 10, 1);
                    shoppingCart.addToCart(sweBar);
                    money -= 10;
                    sum += 10;
                    System.out.println("*SWEBAR Strawberry proteinbar has been added to your shopping cart*");
                    break;
                case "2":
                    ProteinBar bareBells = new ProteinBar("BAREBELLS Cookies and cream proteinbar", 13, 15, 1);
                    shoppingCart.addToCart(bareBells);
                    money -= 13;
                    sum += 13;
                    System.out.println("*Barebells cookies and cream proteinbar has been added to your shopping cart*");
                    break;

                case "3":
                    ProteinBar core = new ProteinBar("CORE chocolate proteinbar", 15, 20, 1);
                    shoppingCart.addToCart(core);
                    money -= 15;
                    sum += 15;
                    System.out.println("*Core chocolate proteinbar has been added to your shopping cart*");
                    break;

                case "4":
                    Chips olw = new Chips("OLW sourcream and onion chips", 18, 20, 1);
                    shoppingCart.addToCart(olw);
                    money -= 18;
                    sum += 18;
                    System.out.println("*OlW sourcream and onion chips has been added to your shopping cart*");
                    break;

                case "5":
                    Chips lays = new Chips("LAYS salted chips", 15, 25, 1);
                    shoppingCart.addToCart(lays);
                    money -= 15;
                    sum += 15;
                    System.out.println("*Lays Salted chips has been added to your shopping cart*");
                    break;

                case "6":
                    Chips doritos = new Chips("DORITOS chili cornchips", 20, 15, 1);
                    shoppingCart.addToCart(doritos);
                    money -= 20;
                    sum += 20;
                    System.out.println("*Doritos chili corn chips has been added to your shopping cart*");
                    break;

                case "0":
                    bool = false;
                    break;
                default:
                    System.out.println("Wrong input! please try again.");
                    break;
            }

        }

    }

    public void addBeverage() {
        boolean bool = true;
        while (money > 10 && bool) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Press 1-5 to add a beverage to your shopping cart. press 0 to go back to mainmenu");
            System.out.println("1.Cocacola           10kr");
            System.out.println("2.Pepsi              10kr");
            System.out.println("3.Fanta              10kr");
            System.out.println("4.Redbull            15kr");
            System.out.println("5.Loka(water)        5kr");
            System.out.println("0.Go to Main menu");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Money left in you wallet: " + money + "kr");

            choice = scanner.next();
            switch (choice) {
                case "1":
                    Beverage cocaCola = new Beverage("Cocacola", 10, 10, 2);
                    shoppingCart.addToCart(cocaCola);
                    money -= 10;
                    sum += 10;
                    System.out.println("*Cocacola has been added to your shopping cart*");
                    break;
                case "2":
                    Beverage pepsi = new Beverage("Pepsi", 10, 10, 2);
                    shoppingCart.addToCart(pepsi);
                    money -= 10;
                    sum += 10;
                    System.out.println("*Pepsi has been added to your shopping cart*");
                    break;
                case "3":
                    Beverage fanta = new Beverage("Fanta", 10, 10, 2);
                    shoppingCart.addToCart(fanta);
                    money -= 10;
                    sum += 10;
                    System.out.println("*Fanta has been added to your shopping cart*");
                    break;
                case "4":
                    Beverage redBull = new Beverage("RedBull", 15, 20, 2);
                    shoppingCart.addToCart(redBull);
                    money -= 15;
                    sum += 15;
                    System.out.println("*Redbull has been added to your shopping cart*");
                    break;
                case "5":
                    Beverage loka = new Beverage("Loka", 5, 0, 2);
                    shoppingCart.addToCart(loka);
                    money -= 5;
                    sum += 5;
                    System.out.println("*Loka has been added to your shopping cart*");
                    break;
                case "0":
                    bool = false;
                    break;
                default:
                    System.out.println("Wrong input! please try again.");
            }
        }
    }

    public void showShoppingCart() {
        boolean bool = true;
        do {
            System.out.println("Press 1-3 to show diffrent lists of grocerys. Press 0 to go back to mainmenu");
            System.out.println("1.Show beverages");
            System.out.println("2.Show Food");
            System.out.println("3.Show all");
            System.out.println("0.Main menu");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    for (Grocery grocery : shoppingCart.groceryList) {
                        if (grocery.getSort() == 2) {
                            System.out.println(grocery);
                        }
                    }
                    break;

                case "2":
                    for (Grocery grocery : shoppingCart.groceryList) {
                        if (grocery.getSort() == 1) {
                            System.out.println(grocery);
                        }
                    }
                    break;
                case "3":
                    int i = 1;
                    Collections.sort(shoppingCart.groceryList);
                    for (Grocery grocery : shoppingCart.groceryList) {
                        System.out.println(i + "." + grocery);
                        i++;
                    }
                    System.out.println("Total sum: " + sum + " kr");
                    break;

                case "0":
                    bool = false;
                    break;
                default:
                    System.out.println("Wrong input! please try again.");
            }
        } while (bool);
    }

    public void removeItemFromShoppingCart() {
        System.out.println("Grocerys in your Shopping cart:");
        System.out.println("--------------------------------");
        int index = 1;
        for (Grocery grocery : shoppingCart.groceryList) {
            System.out.println(index + "." + grocery);
            index++;
        }
        System.out.println("Press the index number of the product you want to remove");
        System.out.println("--------------------------------------------------------");
        int input=scanner.nextInt();
         index=1;
         int removeIndex=0;
        for (Grocery grocery : shoppingCart.groceryList){
            if(index==input){
                System.out.println(grocery+" has been removed from shopping cart");
                break;
            }
            index++;
            removeIndex++;
        }
        sum = (sum - (shoppingCart.groceryList.get(removeIndex).getPrice()));
        shoppingCart.groceryList.remove(removeIndex);
    }
}
