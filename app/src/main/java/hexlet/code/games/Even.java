package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int RANGE = 100; // range int from 0 to 1000

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean playGame(String userName) {
        boolean result = true;
        int number;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            Engine.questions[i][Engine.INDEX_QUESTION] = Integer.toString(number);
            Engine.questions[i][Engine.INDEX_ANSWER] = isEven(number) ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName);
        return result;
    }

}
