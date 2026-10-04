package Behavioral.Observer;

public class BinaryObserver extends Observer{
    
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);    // 1 subject <--- 1 BinaryObserver
    }

    @Override 
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
