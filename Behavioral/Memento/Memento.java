package Behavioral.Memento;

public class Memento {      // store orginator's state
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return this.state;
    }
}
