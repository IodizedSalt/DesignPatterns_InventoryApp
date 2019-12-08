public class Vegetable extends Item{

    private String itemName;
    private int itemAmount;
    private String itemExpirationDate;
    private int itemWeight;


    public GreensStrategy getStrategy() {
        return new GreensStrategy();
    }
//    @Override
//    public void setWeight(int itemWeight) {
//        this.itemWeight = itemWeight;
//    }
//
//    @Override
//    public int getWeight() {
//        return itemWeight;
//    }
//
//    @Override
//    public void setAmount(int itemAmount) {
//        this.itemAmount = itemAmount;
//    }
//
//    @Override
//    public int getAmount() {
//        return itemAmount;
//    }
//
//    @Override
//    public void setExpirationDate(String expirationDate) {
//        this.itemExpirationDate = itemExpirationDate;
//    }
//
//    @Override
//    public String getExpirationDate() {
//        return itemExpirationDate;
//    }
//
//    @Override
//    public void setName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    @Override
//    public String getName() {
//        return this.itemName;
//    }
//
//    @Override
//    public String displayInformation() {
//        return this.itemName;
//    }
}
