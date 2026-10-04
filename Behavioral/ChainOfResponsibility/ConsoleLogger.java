package Behavioral.ChainOfResponsibility;

public class ConsoleLogger extends AbstractLogger{  // concreate handler
    public ConsoleLogger(int level){
        this.level = level; 
    }

    @Override 
    protected void write(String message){
        System.out.println("Console Logger::write() - Level "+ this.level +" - " + message);
    }
}
