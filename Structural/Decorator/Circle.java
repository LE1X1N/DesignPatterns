package Structural.Decorator;

public class Circle implements Shape{   // Concrete Component
    @Override 
    public void draw(){
        System.out.println("Shape-Circle::Draw()");
    }
}
