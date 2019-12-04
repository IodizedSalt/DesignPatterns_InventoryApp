public interface Item {
    int weight = 0; // Item weight in g/kg
   // int amount = 0; // Item amount in pieces/boxes/cans/bags
    String itemName = null;

    //int getWeight();
    int setWeight(int itemWeight);

    String getName();
    String setName(String itemName);

}
