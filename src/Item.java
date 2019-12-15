public abstract class Item {

    private String itemName;
    private int itemAmount;
    private int itemWeight;
    private String itemExpirationDate;

    protected abstract Strategy getStrategy();

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

    void setExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
    }

    String getExpirationDate() {
        return itemExpirationDate;
    }


    void setName(String itemName){
        this.itemName = itemName;
    }

    String getName(){
        return itemName;
    }

    String displayInformation(){
        return "Item name: " + this.getName() + " | Quantity: " + this.getAmount();
    }





}
