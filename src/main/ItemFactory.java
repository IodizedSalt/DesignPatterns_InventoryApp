package main;

import item_types.Fruit;
import item_types.Meat;
import item_types.Spice;
import item_types.Vegetable;

public class ItemFactory {

    public Item getItem(String itemName){
        if(itemName.equalsIgnoreCase("Vegetable") || itemName.equals("1")){
            return new Vegetable();

        } else if(itemName.equalsIgnoreCase("Fruit") || itemName.equals("2")){
            return new Fruit();

        } else if(itemName.equalsIgnoreCase("Meat") || itemName.equals("3") ){
            return new Meat();

        } else if(itemName.equalsIgnoreCase("Spice") || itemName.equals("4") ){
            return new Spice();

        }else{
            return new NoItem();
        }
     }
}
