package main;

import memento.CareTaker;
import memento.Originator;
import strategy.Context;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GenerateData generateData = new GenerateData();

        ArrayList<Item> items = new ArrayList<>();      //List that holds all items in inventory
        ArrayList<Item> prevState = new ArrayList<>();  //List that holds the previous state of an inventory (For undo's)
        ArrayList<Item> tmp = new ArrayList<>();        //List to hold temporary values to update items list. Used to fix concurrency/synchronization issue when accessing elements of a list

        ItemFactory itemFactory = new ItemFactory();
        Context context = new Context();

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        Scanner prompt = new Scanner(System.in);
        int response;

        while(true){

            generateData.printMenu();
            response = prompt.nextInt();

            switch (response){
                case 1:
                    if(originator.getState() != null){
                        items = originator.getState();
                    }
                    showItems(items);
                    break;
                case 2:
                    originator.setState(prevState);                     // Set state of the memento to hold the prevState (the items in the list before the new insertion)
                    careTaker.add(originator.saveStateToMemento());     // Add to list of mementos the current memento state

                    prevState.clear();                                  // Clear the prevState array and then populate with the new items after setting originator State. Prevents Heap exception and duplicated elements
                    prevState.addAll(items);

                    items = context.addItemStrategy(prompt, itemFactory, items);
                    originator.setState(items);
                    break;
                case 3:
                    prevState.clear();                                  // Clear the prevState array and then populate with the existing items in the inventory before a deletion occurs.
                    prevState.addAll(originator.getState());

                    showItems(items);

                    System.out.println("Which item to delete?");

                    items = context.deleteItemStrategy(prompt, items);
                    originator.setState(items);
                    break;

                case 4:
                    tmp.clear();                                       // Clear the tmp list and populate with prevState elements before an undo is done

                    tmp.addAll(prevState);

                    if(prevState.size() >0){                            // Pop the top element off the array of prevState. This is probably an incorrect way of doing an undo feature.
                        prevState.remove(prevState.size()-1);
                    }
                    originator.setState(tmp);
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