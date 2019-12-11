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


    ArrayList<Item> addItemStrategy(Scanner scanner, ItemFactory factory, ArrayList<Item> items){
        GenerateData generateData = new GenerateData();
        generateData.addItem();
//        System.out.println("What food you like to add?\n1 - Vegetable\n2 - Fruit\n3 - Meat\n4 - Spice");
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




}
