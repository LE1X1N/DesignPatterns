package Behavioral.Template;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game_cricket = new Cricket();
        game_cricket.play();    // call template

        Game game_football = new Football();
        game_football.play();
    }
}

// Cricket game initialized! Start playing...
// Cricket game started!
// Cricket game finished! Thx!

// Football game Initialized! Start playing...
// Football game started!
// Foot game finished! Thx!