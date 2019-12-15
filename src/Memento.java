import java.util.ArrayList;

public class Memento {
    private ArrayList<Item> state;

    public Memento(ArrayList<Item> state){
        this.state = state;
    }

    ArrayList<Item> getState(){
        return state;
    }
}
