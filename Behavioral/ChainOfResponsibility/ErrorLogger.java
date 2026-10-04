package Behavioral.ChainOfResponsibility;

public class ErrorLogger extends AbstractLogger{    //Concreate Handler
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override 
    protected void write(String message){
        System.out.println("Error Logger::write() - Level "+ this.level +" - " + message);
    }   
}
