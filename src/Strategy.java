import java.util.ArrayList;
import java.util.Scanner;

public interface Strategy {

    Item addNewItem(Scanner scanner, Item item, String itemName);
    void addToExistingItem(Scanner scanner, Item item, String itemName, int currentAmount);

}
