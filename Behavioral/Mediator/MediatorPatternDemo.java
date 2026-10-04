package Behavioral.Mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        User messi = new User("Messi");

        robert.sendMessage("Hello! John and Messi!");
        john.sendMessage("Good morning!");
        messi.sendMessage("Hi!");
    }
}

// Sun Oct 04 16:03:02 CST 2026 [Robert]: Hello! John and Messi!
// Sun Oct 04 16:03:03 CST 2026 [John]: Good morning!
// Sun Oct 04 16:03:03 CST 2026 [Messi]: Hi!