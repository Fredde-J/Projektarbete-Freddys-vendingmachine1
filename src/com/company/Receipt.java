package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Receipt {
    public static void makeReceiptFile(){
        ObjectOutputStream objectOutputStream = null;
        FileOutputStream fileOutputStream = null;
        ShoppingCart shoppingCart = new ShoppingCart();
        try{
            fileOutputStream = new FileOutputStream("receiptFile.ser", true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(shoppingCart.groceryList);
            objectOutputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static List<Grocery> copyReceipt(String fileName){
        ObjectInputStream objectinputstream = null;
        List<Grocery> grocerys = null;
        try {
            FileInputStream streamIn = new FileInputStream(fileName);
            objectinputstream = new ObjectInputStream(streamIn);
            grocerys = (List<Grocery>) objectinputstream.readObject();
            objectinputstream .close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return grocerys;
    }
}
