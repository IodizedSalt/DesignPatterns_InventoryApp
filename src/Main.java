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

//        ItemFactory itemFactory = new ItemFactory();
//
//        Item carrot = itemFactory.getItem("Vegetable");
//        carrot.setName("Carrot");
////
//        Item apple = itemFactory.getItem("Fruit");
//        apple.setName("Apple");
//
//        Item pork = itemFactory.getItem("Meat");
//        pork.setName("Pork");
//
//        Item melange = itemFactory.getItem("Spice");
//        melange.setName("Melange");
//
//
//        carrot.getName();
//        apple.getName();
//        pork.getName();
//        melange.getName();

    }

    public static void showItems(ArrayList<Item> items){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getName());
        }

    }
    public static void addItemPrompt(Scanner prompt, ItemFactory factory, ArrayList<Item> items) {
        System.out.println("What food you like to add?\n1 - Vegetable\n2 - Fruit\n3 - Meat\n4 - Spice");
        int input = prompt.nextInt();
        switch (input) {
            case 1:
                Item vegetableToAdd = factory.getItem("Vegetable");

                Context context = new Context(new VegetableStrategy());
                vegetableToAdd = context.executeStrategy(prompt, vegetableToAdd);

                items.add(vegetableToAdd);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
        }
    }

}
