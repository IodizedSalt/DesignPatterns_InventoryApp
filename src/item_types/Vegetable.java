package item_types;

import strategy.GreensStrategy;
import main.Item;

public class Vegetable extends Item {

    public GreensStrategy getStrategy() {
        return new GreensStrategy();
    }

}
