package Creational.Singleton;

public class SingleObject {

    private SingleObject(){}    // private constructor

    private static SingleObject instance = new SingleObject();  // Singleton

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage() {
        System.out.println("SingleObject::showMessage() methods");
    }
}