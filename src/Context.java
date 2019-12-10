import java.util.ArrayList;
import java.util.Scanner;

public class Context {
    private Strategy strategy;

    Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }


    public Strategy getStrategy() {
        return strategy;
    }


    ArrayList<Item> addItemStrategy(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName){

        return strategy.addingNewItem(scanner, items, itemToAdd, itemName);
    }


}
