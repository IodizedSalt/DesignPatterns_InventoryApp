import java.util.Scanner;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Item newItemStrategy(Scanner scanner, Item item, String itemName){
        return strategy.addNewItem(scanner, item, itemName);
    }

    public Item oldItemStrategy(Scanner scanner, Item item, String itemName){
        return strategy.addOldItem(scanner, item, itemName);
    }
}
