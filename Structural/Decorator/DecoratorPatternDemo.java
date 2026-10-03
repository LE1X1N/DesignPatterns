package Structural.Decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Circle with normal border:");
        circle.draw();

        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        System.out.println("\nCircle of red border:");
        redCircle.draw();

        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border:");
        redRectangle.draw();
    }
}
