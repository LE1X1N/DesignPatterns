package Structural.Decorator;

public class RedShapeDecorator extends ShapeDecorator{  // Concrete Decorator
    
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){    // new feature
        System.out.println("Border Color: Red");
    }

    @Override 
    public void draw(){
        super.draw();
        this.setRedBorder(decoratedShape);
    }

}
