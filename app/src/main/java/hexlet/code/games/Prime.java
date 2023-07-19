package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    static final int RANGE = 100; // range int from 0 to 100

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

    public static boolean playGame(String userName) {
        boolean result = true;
        int number;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            Engine.questions[i][Engine.INDEX_QUESTION] = Integer.toString(number);
            Engine.questions[i][Engine.INDEX_ANSWER] = isPrime(number) ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName);
        return result;
    }
}
