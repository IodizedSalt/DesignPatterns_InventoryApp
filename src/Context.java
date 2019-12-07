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

    public Item executeStrategy(Scanner scanner, Item item){
        return strategy.addItem(scanner, item);
    }
}
