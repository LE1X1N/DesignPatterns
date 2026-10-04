package Behavioral.Command;

public class Stock {    // Invoker
    public String name = "AAPL";
    public int quantity = 100;

    public void buy(){
        System.out.println("Stock [Name: "+ this.name  + " Quantity: " + quantity +" bought]");
    }

    public void sell(){
        System.out.println("Stock [Name: "+ this.name  + " Quantity: " + quantity +" sold]");
    }
}
