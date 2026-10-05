package Behavioral.Visitor;

public interface ComputerPartVisitor {   // visitor
    // visit different elements
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
