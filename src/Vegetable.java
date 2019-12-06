public class Vegetable implements Item{

    private String itemName;

    @Override
    public int setWeight(int itemWeight) {
        return 0;
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
