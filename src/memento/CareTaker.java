

package memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public void pop(){
        int mementoListSize = mementoList.size();

        if(mementoListSize >= 1){
            mementoList.remove(mementoListSize-1);
        }
    }

    public Memento get(){
        return mementoList.get(getSize()-1);
    }

    public Integer getSize(){
        return mementoList.size();
    }

}
