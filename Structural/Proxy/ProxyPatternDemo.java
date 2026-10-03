package Structural.Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Difference from the Adapter pattern: The Adapter pattern changes the interface, while the Proxy pattern does not.
        // Difference from the Decorator pattern: The Decorator pattern is used to enhance functionality, while the Proxy pattern is used to control access.

        // access real subject by proxy
        Image image = new ProxyImage("a_nice_photo.png");   
        image.display();  // still use display() func

    }
}
