public class Spice implements Item {
    private String itemName;
    private int itemAmount;
//    private String itemExpirationDate;
    private int itemWeight;

//    @Override
    public void setWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

//    @Override
    public int getWeight() {
        return itemWeight;
    }

//    @Override
    public void setAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

//    @Override
    public int getAmount() {
        return itemAmount;
    }

//    public void setExpirationDate(String itemExpirationDate) {
//        this.itemExpirationDate = itemExpirationDate;
//    }
//
//    public String getExpirationDate() {
//        return itemExpirationDate;
//    }

//    @Override
    public void setName(String itemName) {
        this.itemName = itemName;
    }

//    @Override
    public String getName() {
        return this.itemName;
    }

    @Override
    public String displayInformation() {
        return this.itemName;
    }
}
