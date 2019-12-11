
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GenerateData generateData = new GenerateData();
//        ArrayList<Item> items = generateData.getList();

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
                    originator.setState(prevState);
                    careTaker.add(originator.saveStateToMemento()); //Save state before insertion

                    prevState.clear();
                    for (Item i:items) {
                        prevState.add(i);
                    }
                    items = context.addItemStrategy(prompt, itemFactory, items);
                    originator.setState(items);
                    break;
                case 3:
                    prevState.clear();
                    for (Item i:originator.getState()){
                        prevState.add(i);
                    }
                    showItems(items);
                    System.out.println("Which item to delete?");
                    items = context.deleteItemStrategy(prompt, items);
                    originator.setState(items);
                    break;

                case 4:
                    tmp.clear();
                    for (Item i:prevState) {
                        tmp.add(i);
                    }
                    if(prevState.size() >0){
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