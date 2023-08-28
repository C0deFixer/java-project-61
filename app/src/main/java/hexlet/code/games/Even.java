package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    static final int RANGE = 100; // range int from 0 to 1000

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void playGame(String userName) {
        int number;
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            Engine.setQuestionAnswer(questions, i, Integer.toString(number), isEven(number) ? "yes" : "no");
        }
        Engine.playGameEngine(userName, RULES, questions);
    }

}
