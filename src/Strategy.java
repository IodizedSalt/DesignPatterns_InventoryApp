import java.util.ArrayList;
import java.util.Scanner;

public interface Strategy {
    //public ArrayList<Item> addItem(Scanner scanner, String itemName, int amount, String expirationDate, String itemBrand);
//    Item addItem(Scanner scanner, Item item);
    Item addNewItem(Scanner scanner, Item item, String itemName);
    Item addOldItem(Scanner scanner, Item item, String itemName);

    //boolean isDuplicate(ArrayList<Item> items, String itemName);
}
