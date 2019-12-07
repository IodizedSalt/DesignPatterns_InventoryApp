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
            System.out.println("Item name: " + item.getName() + "| Amount: " + item.getAmount());
        }

    }
    public static void addItemPrompt(Scanner prompt, ItemFactory factory, ArrayList<Item> items) {
        System.out.println("What food you like to add?\n1 - Vegetable\n2 - Fruit\n3 - Meat\n4 - Spice");
        int input = prompt.nextInt();
        switch (input) {
            case 1:
                Item vegetableToAdd = factory.getItem("Vegetable");
                Context context = new Context(new VegetableStrategy());

                System.out.println("What type of Vegetable?");
                String vegetableName = prompt.next();

                vegetableToAdd.setName(vegetableName);
                int position = isDuplicate(items, vegetableName);
                if(isDuplicate(items, vegetableName) != 999999 ){
                    //builder pattern
                    int currentAmount = items.get(position).getAmount();
                    int addedItemAmount = context.oldItemStrategy(prompt, vegetableToAdd, vegetableName).getAmount();
                    int newAmount = currentAmount + addedItemAmount;
                    items.get(position).setAmount(newAmount);
                }else{
                    vegetableToAdd = context.newItemStrategy(prompt, vegetableToAdd, vegetableName);
                    items.add(vegetableToAdd);
                }

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
        }
    }

        public static int isDuplicate(ArrayList<Item> items, String itemName) {
       //Use iterator?
        for (int i = 0; i < items.size() ; i++) {
            if(items.get(i).getName().equalsIgnoreCase(itemName)){
                return i;
            }
        }
        return 999999;
    }

}
