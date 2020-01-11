package strategy;

import main.GenerateData;
import main.Item;
import main.ItemFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public ArrayList<Item> addItemStrategy(Scanner scanner, ItemFactory factory, ArrayList<Item> items){
        GenerateData.addItem(); // Prints the console output prompt nicely
        String input = scanner.next();

        Item itemToAdd = factory.getItem(input);

        if(itemToAdd.getStrategy() == null){
            System.out.println("Invalid Selection");
            return items;
        }

        System.out.println("What is the name of the item?");
        String itemName = scanner.next();

        itemToAdd.setName(itemName);

        this.setStrategy(itemToAdd.getStrategy());

        return strategy.addingNewItem(scanner, items, itemToAdd, itemName);
    }

    public ArrayList<Item> deleteItemStrategy(Scanner scanner, ArrayList<Item> items){
        String input = scanner.next();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            if(item.getName().equalsIgnoreCase(input)){
                items.remove(item);
            }
        }
        return items;
    }




}
