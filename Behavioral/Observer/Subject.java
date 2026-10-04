package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {  // Subject / Concreate Subject

    // 1 subject ---> n observers
    private List<Observer> observers = new ArrayList<Observer>();   // list of observers

    private int state;

    public void attach(Observer observer){
        observers.add(observer);        // add other observer
    }

    public int getState(){
        return this.state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObservers();       // when state has changed, notify all observers
    }

    public void notifyAllObservers(){
        for (Observer observer : this.observers){
            observer.update();      
        }
    }


}
