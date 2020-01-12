package strategy;

import main.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class GreensStrategy implements Strategy {

    public ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName) {
        if(isDuplicate(items, itemName) != -1 ){
            int position = isDuplicate(items, itemName);
            int currentAmount = items.get(position).getAmount();

            System.out.printf("How many more %s\n", itemName);
            int vegetableAmount = scanner.nextInt();
            items.get(position).setAmount(currentAmount + vegetableAmount);
            return items;
        }else{
            System.out.printf("How many %s\n", itemName);
            int vegetableAmount = scanner.nextInt();
            itemToAdd.setAmount(vegetableAmount);
            items.add(itemToAdd);
            return items;
        }
    }

    private static int isDuplicate(ArrayList<Item> items, String itemName) {
        for (int i = 0; i < items.size() ; i++) {
            if(items.get(i).getName().equalsIgnoreCase(itemName)){
                return i;
            }
        }
        return -1;
    }


}
