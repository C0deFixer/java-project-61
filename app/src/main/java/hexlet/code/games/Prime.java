package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Prime {
    static final int RANGE = 100;// range int from 0 to 100
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

        String[] questions = new String[App.QUESTIONS_COUNT];
        String[] rightAnswers = new String[App.QUESTIONS_COUNT];

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < App.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            questions[i] = Integer.toString(number);
            rightAnswers[i] = isPrime(number) ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
