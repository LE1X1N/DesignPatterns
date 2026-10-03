package Structural.Flyweight;

public class Circle implements Shape{   // Flyweight
    private String color;   // intrinsic state

    private int x;          // extrinsic state set by client
    private int y;
    private int radius;

    public Circle(String color){
        this.color = color;     // set intrinsic state
    }

    public void setX(int x){
        this.x = x;             // call by client
    }

    public void setY(int y){
        this.y = y;             // call by client
    }

    public void setRadius(int radius){
        this.radius = radius;   // call by client
    }

    @Override
    public void draw(){
        System.out.println("Circle:: Draw() [Color: "+ color + ", x: "+ x + ", y: " + y + ", radius: " + radius +"]");
    }
}
