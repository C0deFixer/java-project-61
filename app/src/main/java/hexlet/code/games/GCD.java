package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int RANGE = 100;
    public static final String RULES = "Find the greatest common divisor of given numbers.";
    public static int getGCD(int a, int b) {
        if (a != 0 && b != 0) {
            return a > b ? getGCD(a % b, b) : getGCD(b % a, a);
        } else {
            return a + b;
        }
    }

    public static void playGame(String userName) {
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {

            int operand1 = Utils.getRandomInt(1, RANGE);
            int operand2 = Utils.getRandomInt(1, RANGE);
            questions[i][Engine.INDEX_QUESTION] = operand1 + " " + operand2;
            questions[i][Engine.INDEX_ANSWER] = Integer.toString(getGCD(operand1, operand2));
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
