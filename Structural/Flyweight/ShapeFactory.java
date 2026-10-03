package Structural.Flyweight;

import java.util.HashMap;

public class ShapeFactory {  // Flyweight Factory
    // a flyweight buffer/pool
    private static HashMap<String, Circle> circleMap = new HashMap<String, Circle>(); 

    public static Circle getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        
        if (circle == null){
            circle = new Circle(color);     // create a shareable flyweight
            circleMap.put(color, circle);   // store in buffer

            System.out.println("Creating circle of color: " + color);
        }
        else{
            System.out.print("Cache hit! -> ");
        }
        return circle;
    }

}
