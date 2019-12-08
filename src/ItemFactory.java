public class ItemFactory {

    public Item getItem(String itemName){
        if(itemName == null){
            return null;
        }
        if(itemName.equalsIgnoreCase("Vegetable")){
            return new Vegetable();

        } else if(itemName.equalsIgnoreCase("Fruit")){
            return new Fruit();

        } else if(itemName.equalsIgnoreCase("Meat")){
            return new Meat();

        } else if(itemName.equalsIgnoreCase("Spice")){
            return new Spice();
        }

        return null;
    }
}
