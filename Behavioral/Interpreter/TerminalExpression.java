package Behavioral.Interpreter;

public class TerminalExpression implements Expression { // Terminal Expression
    private String data;    // terminal symbols

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override 
    public boolean interpret(String context){
        if (context.contains(this.data)){
            return true;        
        }
        else{
            return false;
        }
    }
}
