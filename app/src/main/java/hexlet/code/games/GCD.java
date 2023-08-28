package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    static final int RANGE = 100;

    static final String RULES = "Find the greatest common divisor of given numbers.";
    public static int getGCD(int a, int b) {
        if (a != 0 && b != 0) {
            return a > b ? getGCD(a % b, b) : getGCD(b % a, a);
        } else {
            return a + b;
        }
    }

    public static void playGame(String userName) {
        int operand1;
        int operand2;
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {

            operand1 = (int) (Math.random() * RANGE);
            operand2 = (int) (Math.random() * RANGE);
            Engine.setQuestionAnswer(questions, i, operand1
                    + " " + operand2, Integer.toString(getGCD(operand1, operand2)));
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
