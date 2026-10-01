public class FactoryPatternDemo{
    public static void main(String[] args){

        ShapeFactory shapeFactory = new ShapeFactory();
        
        // Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        
        // Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}