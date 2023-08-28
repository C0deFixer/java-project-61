package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int RANGE = 100; // range int from 0 to 100

    static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void playGame(String userName) {
        boolean result = true;
        int number;
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            Engine.setQuestionAnswer(questions, i, Integer.toString(number), isPrime(number) ? "yes" : "no");
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
