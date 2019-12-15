
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = GenerateData.getList();
        // Store inventory from GenerateData.java in local 'items' ArrayList
        ItemFactory itemFactory = new ItemFactory();
        Context context = new Context();
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        Scanner prompt = new Scanner(System.in);
        int response;

        while(true){
            GenerateData.printMenu();
//            System.out.println("| What would you like to do? |\n| 1 - View inventory |\n| 2 - Add item |\n| 3 - Delete item |\n| 4 - Exit program |");
            originator.setState(items);
            careTaker.add(originator.saveStateToMemento());

            response = prompt.nextInt();
            switch (response){
                case 1:
                    showItems(items);
                    break;
                case 2:

                    break;
                case 3:
                    showItems(items);
                    System.out.println("Which item to delete?");
                    break;
                case 4:

                    System.out.println(items);
                    break;

                case 5:
                        System.out.println("Bye");
                        System.exit(0);
            }
        }
    }

    private static void showItems(ArrayList<Item> items){
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println(item.displayInformation());
        }
        System.out.println(); //Just an empty spacing line
    }

}
