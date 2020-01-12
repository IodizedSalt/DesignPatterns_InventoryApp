package strategy;

import main.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class NullStrategy implements Strategy {
    public ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName) {
        System.out.println("Invalid selection");
        return items;
    }
}
