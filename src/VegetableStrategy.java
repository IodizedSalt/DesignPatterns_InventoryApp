import java.util.ArrayList;
import java.util.Scanner;

public class VegetableStrategy implements Strategy {

    @Override
    public Item addNewItem(Scanner scanner, Item item, String itemName) {


        System.out.printf("How many %s\n", itemName);
        int vegetableAmount = scanner.nextInt();
        item.setAmount(vegetableAmount);

        return item;
    }

    @Override
    public void addToExistingItem(Scanner scanner, Item item, String itemName, int currentAmount) {
        System.out.printf("How many %s\n", itemName);
        int vegetableAmount = scanner.nextInt();
        item.setAmount(currentAmount + vegetableAmount);
    }


}
