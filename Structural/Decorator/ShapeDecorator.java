package Structural.Decorator;

public abstract class ShapeDecorator implements Shape{  //Decorator
    // The decorator and the object being decorated are of the same type, and they can replace each other.

    protected Shape decoratedShape;  // original object

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();      // original drawing
    }
}
