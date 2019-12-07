public class Spice implements Item {
    private String itemName;
    private int itemAmount;
    private String itemExpirationDate;
    @Override
    public int setWeight(int itemWeight) {
        return 0;
    }

    @Override
    public void setAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    @Override
    public int getAmount() {
        return itemAmount;
    }

    @Override
    public void setExpirationDate(String itemExpirationDate) {
        this.itemExpirationDate = itemExpirationDate;
    }

    @Override
    public String getName() {
        return this.itemName;
    }

    @Override
    public String setName(String itemName) {
        this.itemName = itemName;
        return itemName;
    }
}
