package Behavioral.Template;

public class Cricket extends Game{  // Concrete class
    @Override 
    public void initialize(){
        System.out.println("Cricket game initialized! Start playing...");
    }

    @Override 
    public void startPlay(){
        System.out.println("Cricket game started!");
    }

    @Override 
    public void endPlay(){
        System.out.println("Cricket game finished! Thx!");
    }
}
