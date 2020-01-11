package item_types;

import main.Item;
import strategy.MeatStrategy;
import strategy.Strategy;

public class Meat extends Item {

    public Strategy getStrategy(){
        return new MeatStrategy();
    }

    @Override
    public String displayInformation() {
        return "Item name: " + this.getName() + " | Quantity: " + this.getAmount() + " | Weight per piece: " + this.getWeight() + " | Expiration: " + this.getExpirationDate();
    }
}
