package Behavioral.ChainOfResponsibility;

public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }

    @Override 
    protected void write(String message){
        System.out.println("File Logger::write() - Level "+ this.level +" - " + message);
    } 
}
