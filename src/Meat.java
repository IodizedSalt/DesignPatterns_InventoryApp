public  class Meat implements Item {

    private String itemName;
    private int itemAmount;

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
        return 0;
    }

    @Override
    public String getName() {
        System.out.println(this.itemName);
        return this.itemName;
    }

    @Override
    public String setName(String itemName) {
        this.itemName = itemName;
        return itemName;
    }
}
