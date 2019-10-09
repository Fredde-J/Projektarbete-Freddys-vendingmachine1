package com.company;

public class ProteinBar extends Food {
    private int protein=0;
    ProteinBar(String name, int price, int protein,int sort){
        super(name,price,sort);
        this.protein=protein;
    }
    public String toString(){
        return "Brand: " + getName() + " / price: " + getPrice() +"kr"+ "/ Protein: "+protein+" g";}

    @Override
    public int compareTo(Grocery grocery) {
        return getSort()-grocery.getSort();
    }
}
