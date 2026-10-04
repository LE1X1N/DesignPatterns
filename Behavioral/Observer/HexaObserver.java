package Behavioral.Observer;

public class HexaObserver extends Observer{
    
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);      // 1 subject <--- 1 HexaObserver
    }

    @Override 
    public void update(){
        System.out.println("Hex String: " + Integer.toHexString(this.subject.getState()));
    }
}
