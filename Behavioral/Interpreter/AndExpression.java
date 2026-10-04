package Behavioral.Interpreter;

public class AndExpression implements Expression { // Non-terminal Expression
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override 
    public boolean interpret(String context){
        // return True when two expressions are both true
        return expr1.interpret(context) && expr2.interpret(context);    
    }
}
