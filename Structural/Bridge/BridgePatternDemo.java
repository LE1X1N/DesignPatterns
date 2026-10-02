package Structural.Bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        
        Circle redCircle = new Circle(new Red());  // Red Circle
        redCircle.draw();

        Circle blueCircle = new Circle(new Blue());  // Blue Circle
        blueCircle.draw();

        Square redSquare = new Square(new Red());   // Red Square
        redSquare.draw();

        Square blueSquare = new Square(new Blue());   // Blue Square
        blueSquare.draw();

    }
}
