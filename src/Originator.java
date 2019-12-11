import java.util.ArrayList;

public class Originator {
    private ArrayList<Item> state;

    public void setState(ArrayList<Item> state){
        this.state = state;
    }

//    public String getState(){
//        for (int i = 0; i < state.size(); i++) {
//            Item item = state.get(i);
//            return item.displayInformation();
//        }
//        return null;
//    }
    public ArrayList<Item> getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
