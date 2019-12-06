import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        int response;
        ItemFactory itemFactory = new ItemFactory();
        Item carrot = itemFactory.getItem("Vegetable");
        carrot.setName("Carrot");
        Item car = itemFactory.getItem("Vegetable");
        car.setName("Carrot");
        ArrayList<Item> items = new ArrayList<>();
        items.add(carrot);
        items.add(car);




        while(true){
            System.out.println("What would you like to do?\n1 - View inventory\n2 - Add item\n3 - Delete item\n4 - Exit program");
            response = prompt.nextInt();
            switch (response){
                case 1:
                    for (int i = 0; i < items.size(); i++) {
                        System.out.println(items.get(i).getName());
                    }
                    break;
                case 2:
                    System.out.println(response);
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

    public static void showItems(){


    }

}
