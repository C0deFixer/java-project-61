package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
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
        int questionsCount = 3;
        boolean result = true;
        int range = 100; // range int from 0 to 100
        int number;

        String[] questions = new String[questionsCount];
        String[] rightAnswers = new String[questionsCount];

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");
        for (int i = 0; i < questionsCount; i++) {
            number = (int) (Math.random() * range);
            questions[i] = Integer.toString(number);
            rightAnswers[i] = isPrime(number) ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
