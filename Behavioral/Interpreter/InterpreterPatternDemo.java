package Behavioral.Interpreter;

public class InterpreterPatternDemo {
    
    public static Expression getMaleExpression(){
        // rule: return True when `context` contains one of these males (Robert / John / David)
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        Expression david = new TerminalExpression("David");
        
        return new OrExpression((new OrExpression(robert, john)), david);
    }

    public static Expression getMarriedWomanExpression(){
        // rule: return True when `context` contains both 'Julie' and 'Married'
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        String[] or_contexts = {
            "John is a boy",
            "John and Robert",
            "David loves Julie",
            "Julie"
        };

        String[] and_contexts = {
            "Julie is married",
            "Johb is married",
            "Julie is an astronaut"
        };
        
        System.out.println("Male Expression: ");
        for (String context : or_contexts){
            System.out.println(context + " - " + isMale.interpret(context));    // context
        };

        System.out.println("\nMarried Woman Expreesion: ");
        for (String context : and_contexts){
            System.out.println(context + " - " + isMarriedWoman.interpret(context));    // context
        };
        
    }
}

// Male Expression: 
// John is a boy - true
// John and Robert - true
// David loves Julie - true
// Julie - false

// Married Woman Expreesion: 
// Julie is married - true
// Johb is married - false
// Julie is an astronaut - false