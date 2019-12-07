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

    public void existingStrategy(Scanner scanner, Item item, String itemName, int currentAmount){
        strategy.addToExistingItem(scanner, item, itemName, currentAmount);
    }


}
