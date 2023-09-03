package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int RANGE = 100; // range int from 0 to 1000

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void playGame(String userName) {
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int number = Utils.getRandomInt(1, RANGE);
            questions[i][Engine.INDEX_QUESTION] = Integer.toString(number);
            questions[i][Engine.INDEX_ANSWER] = isEven(number) ? "yes" : "no";
        }
        Engine.playGameEngine(userName, RULES, questions);
    }

}
