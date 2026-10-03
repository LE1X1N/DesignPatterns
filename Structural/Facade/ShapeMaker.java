package Structural.Facade;

public class ShapeMaker {   //Facade
    
    private Circle circle;
    private Rectangle rectangle;
    private Square square;

    public ShapeMaker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        this.circle.draw();
    }

    public void drawRectangle(){
        this.rectangle.draw();
    }

    public void drawSquare(){
        this.square.draw();
    }

}
