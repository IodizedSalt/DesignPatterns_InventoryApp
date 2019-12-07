import java.util.Scanner;

public class FruitStrategy implements Strategy {

    @Override
    public Item addNewItem(Scanner scanner, Item item, String itemName) {


        System.out.printf("How many %s\n", itemName);
        int fruitAmount = scanner.nextInt();
        item.setAmount(fruitAmount);

        return item;
    }

    @Override
    public void addToExistingItem(Scanner scanner, Item item, String itemName, int currentAmount) {
        System.out.printf("How many %s\n", itemName);
        int fruitAmount = scanner.nextInt();
        item.setAmount(currentAmount + fruitAmount);
    }


}
