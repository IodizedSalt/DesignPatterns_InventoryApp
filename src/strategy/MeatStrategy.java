package strategy;

import main.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class MeatStrategy implements Strategy {

    public ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName) {

        System.out.printf("How many kgs of %s \n ", itemName);
        int amount = scanner.nextInt();

        System.out.printf("How many pieces of %s \n ", itemName);
        int quantity = scanner.nextInt();

        System.out.println("What is the expiration date?");
        String expirationDate = scanner.next();

        itemToAdd.setAmount(quantity);

        itemToAdd.setWeight(amount);
        itemToAdd.setExpirationDate(expirationDate);
        items.add(itemToAdd);
        return items;
    }


}
