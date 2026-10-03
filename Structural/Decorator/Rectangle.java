package Structural.Decorator;

public class Rectangle implements Shape{    // Concrete Component
    @Override 
    public void draw(){
        System.out.println("Shape-Rectangle::Draw()");
    }
}
