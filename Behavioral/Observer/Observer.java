package Behavioral.Observer;

public abstract class Observer {
    public Subject subject;     // 1 subject <--- 1 observers

    public abstract void update();  // update when subject changes
}
