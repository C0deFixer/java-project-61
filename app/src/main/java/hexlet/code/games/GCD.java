package hexlet.code.games;

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

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            operand1 = (int) (Math.random() * RANGE);
            operand2 = (int) (Math.random() * RANGE);

            Engine.questions[i][Engine.INDEX_QUESTION] = operand1 + " " + operand2;
            Engine.questions[i][Engine.INDEX_ANSWER] = Integer.toString(getGCD(operand1, operand2));
        }
        result = Engine.playGameEngine(userName);
        return result;
    }
}
