import java.util.ArrayList;
import java.util.Scanner;

public class SpiceStrategy implements Strategy{



    @Override
    public ArrayList<Item> addingNewItem(Scanner scanner, ArrayList<Item> items, Item itemToAdd, String itemName) {
        if(isDuplicate(items, itemName) != -1){
            int position = isDuplicate(items, itemName);
            int currentAmount = items.get(position).getAmount();
            System.out.printf("How much more of %s\n", itemName);
            int amount = scanner.nextInt();
            items.get(position).setAmount(currentAmount + amount);
            return items;
        }else{
            System.out.printf("How much of %s\n", itemName);
            int amount = scanner.nextInt();
            itemToAdd.setAmount(amount);
            System.out.println(itemToAdd.getClass());
            items.add(itemToAdd);
            return items;
        }
    }


    private static int isDuplicate(ArrayList<Item> items, String itemName) {
        //Use iterator?
        for (int i = 0; i < items.size() ; i++) {
            if(items.get(i).getName().equalsIgnoreCase(itemName)){
                return i;
            }
        }
        return -1;
    }
}
