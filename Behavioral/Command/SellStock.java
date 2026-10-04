package Behavioral.Command;

public class SellStock implements Order{    // Sell Command
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override 
    public void execute(){
        this.stock.sell();
    }
    
}
