package Structural.Flyweight;

import java.util.Random;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        
        for (int i = 0 ; i < 50 ; i++){
            // try to get a flyweight from the buffer by intrinsic state
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            
            // set extrinsic state of flyweight
            circle.setX((int)(random.nextDouble() * 100));
            circle.setY((int)(random.nextDouble() * 100));
            circle.setRadius((int)(random.nextDouble() * 100));

            circle.draw();
        }
    }

    private static final String[] colors = {"Red", "Green", "Blue", "White", "Black"};
    private static final Random random = new Random();

    public static String getRandomColor(){
        int index = random.nextInt(colors.length);
        return colors[index];
    }

}


// Creating circle of color: Red
// Circle:: Draw() [Color: Red, x: 17, y: 8, radius: 23]
// Creating circle of color: White
// Circle:: Draw() [Color: White, x: 33, y: 51, radius: 69]
// Creating circle of color: Blue
// Circle:: Draw() [Color: Blue, x: 26, y: 65, radius: 50]
// Creating circle of color: Black
// Circle:: Draw() [Color: Black, x: 87, y: 84, radius: 56]
// Cache hit! -> Circle:: Draw() [Color: Blue, x: 21, y: 68, radius: 62]
// Creating circle of color: Green
// Circle:: Draw() [Color: Green, x: 96, y: 37, radius: 81]
// Cache hit! -> Circle:: Draw() [Color: Blue, x: 60, y: 50, radius: 34]
// Cache hit! -> Circle:: Draw() [Color: White, x: 51, y: 66, radius: 91]
// Cache hit! -> Circle:: Draw() [Color: White, x: 32, y: 59, radius: 39]
// Cache hit! -> Circle:: Draw() [Color: Green, x: 8, y: 3, radius: 14]
