package Behavioral.Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());
    }
}


// Moving mouse...
// Using keyboard...
// Monitor playing...
// Visiting computer...