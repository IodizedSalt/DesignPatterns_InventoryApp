import java.util.Scanner;

public class SpiceStrategy implements Strategy{

    @Override
    public Item addNewItem(Scanner scanner, Item item, String itemName) {


        System.out.printf("How much %s (g)\n", itemName );
        int vegetableAmount = scanner.nextInt();
        item.setAmount(vegetableAmount);

        return item;
    }

    @Override
    public void addToExistingItem(Scanner scanner, Item item, String itemName, int currentAmount) {
        System.out.printf("How many % (g)\n", itemName);
        int vegetableAmount = scanner.nextInt();
        item.setAmount(currentAmount + vegetableAmount);
    }

}
