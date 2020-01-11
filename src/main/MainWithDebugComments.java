package main;

import memento.CareTaker;
import memento.Originator;
import strategy.Context;

import java.util.ArrayList;
import java.util.Scanner;

public class MainWithDebugComments {

    public static void main(String[] args) {
        GenerateData generateData = new GenerateData();
//        ArrayList<Misc.Item> items = generateData.getList();
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> prevState = new ArrayList<>();
        ArrayList<Item> tmp = new ArrayList<>();

        // Store inventory from Misc.GenerateData.java in local 'items' ArrayList

        ItemFactory itemFactory = new ItemFactory();
        Context context = new Context();

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        Scanner prompt = new Scanner(System.in);
        int response;

        while(true){

            generateData.printMenu();
//            System.out.println("| What would you like to do? |\n| 1 - View inventory |\n| 2 - Add item |\n| 3 - Delete item |\n| 4 - Exit program |");
            response = prompt.nextInt();
            switch (response){
                case 1:
//                    System.out.println("prevState: " + prevState);

                    if(originator.getState() != null){
                        items = originator.getState();
                        System.out.println("ORIGINATOR STATE: " + originator.getState());

                    }
                    showItems(items);
                    break;
                case 2:
                    originator.setState(prevState);
                    careTaker.add(originator.saveStateToMemento()); //Save state before insertion
//                    System.out.println("ORIGINATOR STATE BEFORE ADD: " + originator.getState());
                    prevState.clear();
                    for (Item i:items) {
                        prevState.add(i);
                    }

                    items = context.addItemStrategy(prompt, itemFactory, items);

//                    System.out.println("PREV STATE " + prevState);
                    originator.setState(items);

//                    System.out.println("ORIGINATOR STATE after add: " + originator.getState());

                    break;
                case 3:
                    prevState.clear();
                    for (Item i:originator.getState()){
                        prevState.add(i);
                    }
//                    System.out.println("tmp: " + tmp);
//                    System.out.println("prevState: " + prevState);
//                    System.out.println("ORIGINATOR STATE: " + originator.getState());
                    showItems(items);
                    System.out.println("Which item to delete?");
                    items = context.deleteItemStrategy(prompt, items);
//                    System.out.println("ITEMS AFTER DELETE: " + items);
                    originator.setState(items);
//                    System.out.println("ORIGINATOR STATE after: " + originator.getState());

                    break;

                case 4:
//                    System.out.println("ITEMS: " +items);
//                    System.out.println("prevState: " +prevState);

                    tmp.clear();

                    for (Item i:prevState) {
                        tmp.add(i);
                    }

                    if(prevState.size() >0){
                        prevState.remove(prevState.size()-1);
                    }
//                    System.out.println("prevstate to: " + prevState);
                    originator.setState(tmp);
//                    System.out.println("new list: " + originator.getState());
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
        System.out.println(""); //Just an empty spacing line
    }

}