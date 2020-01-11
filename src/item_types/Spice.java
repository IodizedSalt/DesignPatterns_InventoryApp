package item_types;

import main.Item;
import strategy.SpiceStrategy;
import strategy.Strategy;

public class Spice extends Item {

    public Strategy getStrategy(){
        return new SpiceStrategy();
    }

}
