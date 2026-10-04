package Behavioral.ChainOfResponsibility;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLogger() {
        // assemble chain of loggers
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // level 3
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);   // level 2
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO); // level 1
    
        errorLogger.setNextLogger(fileLogger);      // Error -> Debug -> Info
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "This is a level-1 information.");

        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a level-2 debug information");

        loggerChain.logMessage(AbstractLogger.ERROR, "This is a level-3 error information");
        
        loggerChain.logMessage(4, "This is a level-4 test information");
    }
}

// Console Logger::write() - Level 1 - This is a level-1 information.
// File Logger::write() - Level 2 - This is a level-2 debug information
// Error Logger::write() - Level 3 - This is a level-3 error information
// Unsupport level: 4