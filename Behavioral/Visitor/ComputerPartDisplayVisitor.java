package Behavioral.Visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {    // Concrete visitor

    @Override 
    public void visit(Computer computer){
        System.out.println("Visiting computer...");
    }

    @Override 
    public void visit(Mouse mouse){
        System.out.println("Moving mouse...");
    }

    @Override 
    public void visit(Keyboard keyboard){
        System.out.println("Using keyboard...");
    }
    
    @Override 
    public void visit(Monitor monitor){
        System.out.println("Monitor playing...");
    }
}