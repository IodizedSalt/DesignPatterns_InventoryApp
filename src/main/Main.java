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
                    showItems(items);
                    break;

                case 2:
                    originator.setState(new ArrayList<>(items));
                    careTaker.add(originator.saveStateToMemento());
                    items = context.addItemStrategy(prompt, itemFactory, items);
                    break;

                case 3:
                    originator.setState(new ArrayList<>(items));
                    careTaker.add(originator.saveStateToMemento());

                    showItems(items);

                    System.out.println("Which item to delete?");

                    items = context.deleteItemStrategy(prompt, items);
                    originator.setState(items);
                    break;

                case 4:
                    items = originator.getStateFromMemento(careTaker.get());
                    careTaker.pop();
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
    }

}