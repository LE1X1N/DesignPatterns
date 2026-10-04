package Behavioral.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        
        // 1 subject <---- 1 BinaryObserver
        //     ^    ^----- 1 OctalObserver
        //     |---------- 1 HexaObserver
        new HexaObserver(subject);  
        new BinaryObserver(subject);
        new OctalObserver(subject);   
        
        System.out.println("First state change: 511");
        subject.setState(511);
        System.out.println("\nSecond state change: 2047");
        subject.setState(2047);     
    }
}


// First state change: 511
// Hex String: 1ff
// Binary String: 111111111
// Octal String: 777

// Second state change: 2047
// Hex String: 7ff
// Binary String: 11111111111
// Octal String: 3777