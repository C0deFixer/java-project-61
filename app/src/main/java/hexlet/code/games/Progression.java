package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    static final int RANGE_PROGRESSION = 10; //Step progression range
    static final int FIST_NUMBER_RANGE = 10; //Step progression range
    static final int NUMBERS_COUNT = 8; //Quantity of numbers in progression

    static final String RULES = "What number is missing in the progression?";
    private static int[] makeProgressionSubsequence(int firstNumber, int stepProgression) {
        int[] result = new int[NUMBERS_COUNT];
        for (int j = 0; j < NUMBERS_COUNT; j++) {
            result[j] = firstNumber + stepProgression * j;
        }
        return result;
    }

    private static String makeQuestionString(int[] progression, int indexHidingNumber) {
        StringJoiner question = new StringJoiner(" ");

        for (int j = 0; j < NUMBERS_COUNT; j++) {

            if (j == indexHidingNumber) {
                question.add("..");
            } else {
                question.add(Integer.toString(progression[j]));
            }
        }
        return question.toString();
    }
    public static void playGame(String userName) {
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int firstNumber = Utils.getRandomInt(1, FIST_NUMBER_RANGE);
            int stepProgression = Utils.getRandomInt(1, RANGE_PROGRESSION);
            int indexHidingNumber = Utils.getRandomInt(1, NUMBERS_COUNT); //not first and not last
            int[] progression = makeProgressionSubsequence(firstNumber, stepProgression);
            String questionString = makeQuestionString(progression, indexHidingNumber);
            Engine.setQuestionAnswer(questions, i, questionString, Integer.toString(progression[indexHidingNumber]));
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
