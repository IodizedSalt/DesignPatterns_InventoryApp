package memento;

import main.Item;

import java.util.ArrayList;

public class Originator {
    private ArrayList<Item> state;

    public void setState(ArrayList<Item> state){
        this.state = state;
    }

    public ArrayList<Item> getState(){
        return this.state;
    }

    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public ArrayList<Item> getStateFromMemento(Memento memento) {
        this.state = memento.getState();
        return this.state;
    }
}
