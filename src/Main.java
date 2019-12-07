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
                    addItemPrompt(prompt, itemFactory, items);
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

    public static void showItems(ArrayList<Item> items){
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println("Item name: " + item.getName() + " | Amount: " + item.getAmount());
        }

    }
    public static void addItemPrompt(Scanner prompt, ItemFactory factory, ArrayList<Item> items) {
        System.out.println("What food you like to add?\n1 - Vegetable\n2 - Fruit\n3 - Meat\n4 - Spice");
        int input = prompt.nextInt();

        System.out.println("What is the name of the item?");
        String itemName = prompt.next();

        switch (input) {
            case 1:
                Strategy vegetableStrategy = new VegetableStrategy();
                addFoodType("Vegetable", vegetableStrategy, factory, itemName, items, prompt);
                break;
            case 2:
                Strategy fruitStrategy = new FruitStrategy();
                addFoodType("Fruit", fruitStrategy, factory, itemName, items, prompt);
                break;
            case 3:
                Strategy meatStrategy = new MeatStrategy();
                addFoodType("Meat", meatStrategy, factory, itemName, items, prompt);
                break;
            case 4:
                Strategy spiceStrategy = new SpiceStrategy();
                addFoodType("Spice", spiceStrategy, factory, itemName, items, prompt);
                break;
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

    private static void addFoodType(String choice, Strategy strategy, ItemFactory factory, String itemName, ArrayList<Item> items, Scanner prompt){
        //builder pattern
        Item itemToAdd = factory.getItem(choice);
        Context context = new Context(strategy);

        itemToAdd.setName(itemName);
        int position = isDuplicate(items, itemName);

        if(isDuplicate(items, itemName) != -1 ){
            int currentAmount = items.get(position).getAmount();
            context.existingStrategy(prompt, items.get(position), itemName, currentAmount);
        }else{
            itemToAdd = context.newItemStrategy(prompt, itemToAdd, itemName);
            items.add(itemToAdd);
        }


    }

}
