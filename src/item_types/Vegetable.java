package item_types;

import strategy.GreensStrategy;
import main.Item;
import strategy.Strategy;

public class Vegetable extends Item {

    public Strategy getStrategy() {
        return new GreensStrategy();
    }

}
