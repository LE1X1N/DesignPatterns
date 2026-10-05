package Behavioral.State;

public class Context {

    // reference to current state, 
    // Context can delegate state-related behaviors through state objects.
    private State state;

    public Context(){
        this.state = null;
    }

    public Context(State state){
        this.state = state;       
    }

    public State getState(){
        return this.state;
    }

    public void setState(State state){
        this.state = state;
    }
}
