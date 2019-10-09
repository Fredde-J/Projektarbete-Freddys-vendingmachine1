package com.company;

public class Beverage extends Grocery {
    private int sugar=0;
    Beverage(String name, int price, int sugar,int sort){
        super(name,price,sort);
        this.sugar=sugar;
    }

    public String toString(){ return "Brand: " + getName() + " / Price: " + getPrice() +"kr"+" / Sugar: "+sugar+"g";}

    @Override
    public int compareTo(Grocery grocery) {return getSort()-grocery.getSort(); }
}
