package Behavioral.Interpreter;

public class OrExpression implements Expression {   // Non-terminal Expression
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2){
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override 
    public boolean interpret(String context){
        // return True when one expression is True
        return expr1.interpret(context) || expr2.interpret(context);    
    }
}
