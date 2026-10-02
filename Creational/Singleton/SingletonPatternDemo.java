package Creational.Singleton;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        
        // Illegal singleton construction
        // Error: The constructor SingleObject() is not visible
        
        // SingleObject object = new SingleObject();

        // Get singleton
        SingleObject object = SingleObject.getInstance();

        object.showMessage();

    }

}