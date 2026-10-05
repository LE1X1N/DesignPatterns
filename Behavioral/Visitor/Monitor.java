package Behavioral.Visitor;

public class Monitor implements ComputerPart{   // Concrete Element
    @Override 
    public void accept(ComputerPartVisitor computerPartVisitor){
        computerPartVisitor.visit(this);     // depends on visitor's action
    }
}
