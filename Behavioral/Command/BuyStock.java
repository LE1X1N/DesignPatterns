package Behavioral.Command;

public class BuyStock implements Order{ // Concreate Command
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override 
    public void execute(){
        this.stock.buy();
    }
}
