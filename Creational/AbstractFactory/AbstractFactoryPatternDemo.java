package Creational.AbstractFactory;

public class AbstractFactoryPatternDemo{

    public static void main(String[] args) {
        
        // Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape1 = shapeFactory.getShape("CIRCLE"); //circle
        shape1.draw();  

        Shape shape2 = shapeFactory.getShape("RECTANGLE"); //rectangle
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");    // square
        shape3.draw(); 
        
        // Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");    // red
        color1.fill();

        Color color2 = colorFactory.getColor("BLUE");   // blue
        color2.fill();

        Color color3 = colorFactory.getColor(("GREEN"));    // green
        color3.fill();

    }

}