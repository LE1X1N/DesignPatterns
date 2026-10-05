package Behavioral.Template;

public abstract class Game {    // abstract class
    
    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play(){   // a template
        initialize();
        startPlay();
        endPlay();
    }
}
