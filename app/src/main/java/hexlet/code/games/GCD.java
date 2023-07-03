package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class GCD {
    static final int RANGE = 100;
    public static int getGCD(int a, int b) {
        if (a != 0 && b != 0) {
            return a > b ? getGCD(a % b, b) : getGCD(b % a, a);
        } else {
            return a + b;
        }
    }

    public static boolean playGame(String userName) {
        boolean result = true;
        int operand1;
        int operand2;

        String[] questions = new String[App.QUESTIONS_COUNT];
        String[] rightAnswers = new String[App.QUESTIONS_COUNT];

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < App.QUESTIONS_COUNT; i++) {
            operand1 = (int) (Math.random() * RANGE);
            operand2 = (int) (Math.random() * RANGE);

            questions[i] = operand1 + " " + operand2;
            rightAnswers[i] = Integer.toString(getGCD(operand1, operand2));
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
