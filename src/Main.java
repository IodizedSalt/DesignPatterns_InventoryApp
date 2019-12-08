import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenerateData generateData = new GenerateData();
        ArrayList<Item> items = generateData.getList();
        // Store inventory from GenerateData.java in local 'items' ArrayList
        ItemFactory itemFactory = new ItemFactory();
        Scanner prompt = new Scanner(System.in);
        int response;

        while(true){
            System.out.println("What would you like to do?\n1 - View inventory\n2 - Add item\n3 - Delete item\n4 - Exit program");
            response = prompt.nextInt();
            switch (response){
                case 1:
                    showItems(items);
                    break;
                case 2:
                    items = addItemPrompt(prompt, itemFactory, items);
                    break;
                case 3:
                    System.out.println(response);
                    break;
                case 4:
                    System.out.println("Bye");
                    System.exit(0);
            }

        }

    }

    private static void showItems(ArrayList<Item> items){
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println(item.getClass());
            // Decorator here
            System.out.println("Item name: " + item.getName() + " | Amount: " + item.getAmount());
        }

    }

    private static ArrayList<Item> addItemPrompt(Scanner prompt, ItemFactory factory, ArrayList<Item> items) {

        System.out.println("What food you like to add?\n1 - Vegetable\n2 - Fruit\n3 - Meat\n4 - Spice");
        String input = prompt.next();

        System.out.println("What is the name of the item?");
        String itemName = prompt.next();

        Item itemToAdd = factory.getItem(input);
        itemToAdd.setName(itemName);

        Strategy strategy = itemToAdd.getStrategy();
        Context context = new Context(strategy);

        items = context.addItemStrategy(prompt, items, itemToAdd, itemName);

        return items;
    }

}
