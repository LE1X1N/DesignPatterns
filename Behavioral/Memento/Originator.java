package Behavioral.Memento;

public class Originator {
    public String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }

    public Memento saveStateMemento(){
        return new Memento(this.state);   // save current state as memento
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
