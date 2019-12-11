import java.util.ArrayList;

public class GenerateData {

        public ArrayList<Item> getList() {
            ItemFactory itemFactory = new ItemFactory();
            Item car = itemFactory.getItem("Vegetable");
            car.setName("Carrot");
            car.setAmount(4);
            ArrayList<Item> items = new ArrayList<>();
            items.add(car);
            return items;
        }
    public static void addItem(){
        String consoleSeparator = "------------------------------------";
        int consoleSeparatorLength = consoleSeparator.length();

        System.out.println(consoleSeparator);
        System.out.println("| What food would you like to add? |");
        String vegetableOption = ("| 1 - Vegetable");


        System.out.print(vegetableOption);
        for (int i = 1; i < (consoleSeparatorLength- vegetableOption.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String fruitOption = ("| 2 - Fruit");
        System.out.print(fruitOption);
        for (int i = 1; i < (consoleSeparatorLength- fruitOption.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String meatOption = ("| 3 - Meat");
        System.out.print(meatOption);
        for (int i = 1; i < (consoleSeparatorLength- meatOption.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String spiceOption = ("| 4 - Spice");
        System.out.print( spiceOption);
        for (int i = 1; i < (consoleSeparatorLength-  spiceOption.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        System.out.println(consoleSeparator);
    }

    public static void printMenu(){
        String consoleSeparator = "------------------------------";
        int consoleSeparatorLength = consoleSeparator.length();

        System.out.println(consoleSeparator);
        System.out.println("| What would you like to do? |");
        String viewInventory = ("| 1 - View inventory");


        System.out.print(viewInventory);
        for (int i = 1; i < (consoleSeparatorLength- viewInventory.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String addItem = ("| 2 - Add item");
        System.out.print(addItem);
        for (int i = 1; i < (consoleSeparatorLength- addItem.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String deleteItem = ("| 3 - Delete item");
        System.out.print(deleteItem);
        for (int i = 1; i < (consoleSeparatorLength- deleteItem.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        String exitProgram = ("| 4 - Exit program");
        System.out.print(exitProgram);
        for (int i = 1; i < (consoleSeparatorLength- exitProgram.length()); i++) {
            System.out.print(" ");
        }
        System.out.print("|\n");

        System.out.println(consoleSeparator);
    }

}
