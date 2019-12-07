import java.util.ArrayList;
import java.util.Scanner;

public class VegetableStrategy implements Strategy {

    @Override
   // public ArrayList<Item> addItem(Scanner scanner, String itemName, int amount, String expirationDate, String itemBrand) {
    public Item addNewItem(Scanner scanner, Item item, String itemName) {
//        System.out.println("What type of Vegetable?");
//        String vegetableName = scanner.next();

        System.out.printf("How many %s\n", itemName);
        int vegetableAmount = scanner.nextInt();
//        item.setName(itemName);
        item.setAmount(vegetableAmount);

        return item;
    }

    @Override
    public Item addOldItem(Scanner scanner, Item item, String itemName) {
        System.out.printf("How many %s\n", itemName);
        int vegetableAmount = scanner.nextInt();
        item.setAmount(vegetableAmount);
        return item;
    }

//    @Override
//    public boolean isDuplicate(ArrayList<Item> items, String itemName) {
//       //Use iterator?
//        for (int i = 0; i < items.size() ; i++) {
//            if(items.get(i).getName().equalsIgnoreCase(itemName)){
//                return true;
//            }
//        }
//        return false;
//    }
}
