package Behavioral.ChainOfResponsibility;

import java.util.logging.Level;

public abstract class AbstractLogger {   // Handler
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;    // log level of current handler

    protected AbstractLogger nextLogger;   // next handler of the chain

    public void setNextLogger(AbstractLogger logger){
        this.nextLogger = logger;  
    }

    public void logMessage(int level, String message){

        if (this.level == level){
            write(message);
        }
        else if (nextLogger != null){
            // pass to next logger
            nextLogger.logMessage(level, message);
        }
        else{
            System.out.println("Unsupport level: " + level);
        }
    }

    protected abstract void write(String message);


}
