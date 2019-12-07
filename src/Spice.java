public class Spice implements Item {
    private String itemName;

    @Override
    public int setWeight(int itemWeight) {
        return 0;
    }

    @Override
    public int setAmount(int itemAmount) {
        return itemAmount;
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
