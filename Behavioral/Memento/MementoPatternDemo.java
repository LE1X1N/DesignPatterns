package Behavioral.Memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();  

        originator.setState("State #1");
        originator.setState("State #2");   
        careTaker.add(originator.saveStateMemento());   // save State #2

        originator.setState("State #3");
        careTaker.add(originator.saveStateMemento());   // save State #3

        originator.setState("State #4");

        System.out.println("Current state: " + originator.getState());      // State #4
        
        originator.getStateFromMemento(careTaker.get(0));  
        System.out.println("First saved state: " + originator.getState());   // State #2

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state: " + originator.getState());   // State #3
    }
}


// Current state: State #4
// First saved state: State #2
// Second saved state: State #3