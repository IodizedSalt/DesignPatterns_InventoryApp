import java.util.ArrayList;
import java.util.Scanner;

public class VegetableStrategy implements Strategy {

    @Override
   // public ArrayList<Item> addItem(Scanner scanner, String itemName, int amount, String expirationDate, String itemBrand) {
    public Item addItem(Scanner scanner, Item item) {
        System.out.println("What type of Vegetable?");
        String vegetableName = scanner.next();

        System.out.printf("How many %s\n", vegetableName);
        int vegetableAmount = scanner.nextInt();
        item.setName(vegetableName);
        item.setAmount(vegetableAmount);

        return item;
    }

    @Override
    public boolean isDuplicate(ArrayList<Item> items, String itemName) {
       //Use iterator?
        for (int i = 0; i < items.size() ; i++) {
            if(items.get(i).getName().equalsIgnoreCase(itemName)){
                return true;
            }
        }
        return false;
    }
}
