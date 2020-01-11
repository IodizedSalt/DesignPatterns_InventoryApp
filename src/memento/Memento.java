package memento;

import main.Item;

import java.util.ArrayList;

public class Memento {
    private ArrayList<Item> state;

    public Memento(ArrayList<Item> state){
        this.state = state;
    }

    public ArrayList<Item> getState(){
        return state;
    }
}
