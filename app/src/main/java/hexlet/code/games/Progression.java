package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final int RANGE_PROGRESSION = 10; //Step progression range
    private static final int FIST_NUMBER_RANGE = 10; //First number Max value
    private static final int NUMBERS_COUNT = 8; //Quantity of numbers in progression

    public static final String RULES = "What number is missing in the progression?";
    private static String[] makeProgressionSubsequence(int firstNumber, int stepProgression, int numbersCount) {
        String[] result = new String[numbersCount];
        for (int j = 0; j < numbersCount; j++) {
            result[j] = Integer.toString(firstNumber + stepProgression * j);
        }
        return result;
    }

    private static String makeQuestionString(String[] progression, int indexHidingNumber) {
        progression[indexHidingNumber] = "..";
        return String.join(" ", progression);
        //StringJoiner question = new StringJoiner(" ");

        /*for (int j = 0; j < NUMBERS_COUNT; j++) {

            if (j == indexHidingNumber) {
                question.add("..");
            } else {
                question.add(Integer.toString(progression[j]));
            }
        }
        return question.toString();*/
    }
    public static void playGame(String userName) {
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            int firstNumber = Utils.getRandomInt(1, FIST_NUMBER_RANGE);
            int stepProgression = Utils.getRandomInt(1, RANGE_PROGRESSION);
            int indexHidingNumber = Utils.getRandomInt(1, NUMBERS_COUNT - 1); //not first and not last
            String[] progression = makeProgressionSubsequence(firstNumber, stepProgression, NUMBERS_COUNT);
            questions[i][Engine.INDEX_ANSWER] = progression[indexHidingNumber];
            questions[i][Engine.INDEX_QUESTION] = makeQuestionString(progression, indexHidingNumber);
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
