package main;

import strategy.Strategy;

public abstract class Item {

    private String itemName;
    private int itemAmount;
    private int itemWeight;
    private String itemExpirationDate;

    public abstract Strategy getStrategy();

    public void setWeight(int itemWeight){
        this.itemWeight = itemWeight;
    }

    public int getWeight(){
        return itemWeight;
    }

    public void setAmount(int itemAmount){
        this.itemAmount = itemAmount;
    }

    public int getAmount(){
        return itemAmount;
    }

    public void setExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
    }

    public String getExpirationDate() {
        return itemExpirationDate;
    }

    public void setName(String itemName){
        this.itemName = itemName;
    }

    public String getName(){
        return itemName;
    }

   public String displayInformation(){
        return "Item name: " + this.getName() + " | Quantity: " + this.getAmount() + "\n";
    }


}
