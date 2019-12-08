import java.util.ArrayList;
import java.util.Scanner;

public class MeatStrategy implements Strategy {

    @Override
    public ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName) {

        System.out.printf("How many kgs of %s \n ", itemName);
        int amount = scanner.nextInt();

        System.out.printf("How many pieces of %s \n ", itemName);
        int quantity = scanner.nextInt();


        System.out.println("What is the expiration date?");
        String expirationDate = scanner.next();

        itemToAdd.setAmount(quantity);

        Meat newMeatItem = (Meat) itemToAdd;
        newMeatItem.setWeight(amount);
        newMeatItem.setExpirationDate(expirationDate);
        items.add(newMeatItem);
        return items;
    }


}
