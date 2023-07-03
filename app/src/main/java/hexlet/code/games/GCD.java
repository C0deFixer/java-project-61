package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static int getGCD(int a, int b) {
        if (a != 0 && b != 0) {
            return a > b ? getGCD(a % b, b) : getGCD(b % a, a);
        } else {
            return a + b;
        }
    }

    public static boolean playGame(String userName, int questionsCount, int range) {
        boolean result = true;
        int operand1;
        int operand2;

        String[] questions = new String[questionsCount];
        String[] rightAnswers = new String[questionsCount];

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < questionsCount; i++) {
            operand1 = (int) (Math.random() * range);
            operand2 = (int) (Math.random() * range);

            questions[i] = operand1 + " " + operand2;
            rightAnswers[i] = Integer.toString(getGCD(operand1, operand2));
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
