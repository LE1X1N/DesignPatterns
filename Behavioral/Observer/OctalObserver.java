package Behavioral.Observer;

public class OctalObserver extends Observer{
    
    public OctalObserver(Subject subject){
        this.subject = subject;         
        this.subject.attach(this);      // 1 subject <--- 1 OctalObserver
    }

    @Override 
    public void update(){
        System.out.println("Octal String: " + Integer.toOctalString(this.subject.getState()));
    }
}
