public class Main {
    public static void main(String[] args) {
        ItemFactory itemFactory = new ItemFactory();

        Item carrot =itemFactory.getItem("Vegetable");
        carrot.setName("Carrot");

        Item apple = itemFactory.getItem("Fruit");
        apple.setName("Apple");

        Item pork = itemFactory.getItem("Meat");
        pork.setName("Pork");

        Item melange = itemFactory.getItem("Spice");
        melange.setName("Melange");


        carrot.getName();
        apple.getName();
        pork.getName();
        melange.getName();


    }
}
