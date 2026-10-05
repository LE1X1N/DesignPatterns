package Behavioral.Template;

public class Football extends Game{     // Concrete class

    @Override
    public void initialize() {
        System.out.println("Football game Initialized! Start playing...");
    }

    @Override
    public void startPlay() {
        System.out.println("Football game started!");
    }

    @Override
    public void endPlay() {
        System.out.println("Foot game finished! Thx!");
    }
}
