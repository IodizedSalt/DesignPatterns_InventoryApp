package item_types;

import main.Item;
import strategy.NullStrategy;
import strategy.Strategy;

public class NoItem extends Item {

    public Strategy getStrategy() {
        return new NullStrategy();
    }
}
