import java.util.ArrayList;
import java.util.Scanner;

public interface Strategy {
    ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName);

}
