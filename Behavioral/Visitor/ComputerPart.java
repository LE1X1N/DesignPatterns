package Behavioral.Visitor;

public interface ComputerPart {     // Element
    public void accept(ComputerPartVisitor computerPartVisitor);    // change action based on visitor
}
