package Behavioral.State;

public class StartState implements State{
    
    @Override 
    public void doAction(Context context){
        System.out.println("Player is in start state");
        context.setState(this);     // set context as start state
    }

    public String toString(){
        return "Start State";
    }
}
