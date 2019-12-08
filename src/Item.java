public abstract class Item {

    private String itemName;
    private int itemAmount;
    private int itemWeight;
    private Strategy strategy;


    void setWeight(int itemWeight){
        this.itemWeight = itemWeight;
    }

    int getWeight(){
        return itemWeight;
    }

    void setAmount(int itemAmount){
        this.itemAmount = itemAmount;

    }

    int getAmount(){
        return itemAmount;
    }

    Strategy getStrategy(){
        return strategy;
    }

    void setName(String itemName){
        this.itemName = itemName;
    }

    String getName(){
        return itemName;
    }
//
    String displayInformation(){
        return null;
    }




}
