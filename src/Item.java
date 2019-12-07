public interface Item {

    String itemName = null; // Name of item
    int weight = 0; // Item weight in g/kg
    int amount = 0; // Item amount in pieces/boxes/cans/bags
    String expirationDate = null; // Date of expiration of item
    String itemBrand = null; // Brand of item


    //int getWeight();
    int setWeight(int itemWeight);

    void setAmount(int itemAmount);

    int getAmount();

    String getName();
    String setName(String itemName);

}
