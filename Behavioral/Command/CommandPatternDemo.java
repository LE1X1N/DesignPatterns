package Behavioral.Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock aaplStock = new Stock();  // Invoker

        Order buyStockOrder = new BuyStock(aaplStock);      // Command
        Order sellStockOrder = new SellStock(aaplStock);    //Command

        Broker broker = new Broker();   // Receiver
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();   // execute command
    }
}

// Stock [Name: AAPL Quantity: 100 bought]
// Stock [Name: AAPL Quantity: 100 sold]
