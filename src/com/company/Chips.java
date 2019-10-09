package com.company;

public class Chips extends Food {
    private int fat =0;
    Chips(String name,int price,int fat, int sort){
        super(name,price,sort);
        this.fat=fat;
    }
    public String toString(){ return "Brand: " + getName() + " / Price: " + getPrice() +"kr"+"/ Fat: "+fat+"g";}

    @Override
    public int compareTo(Grocery grocery) {
        return getSort()-grocery.getSort();
    }
}
