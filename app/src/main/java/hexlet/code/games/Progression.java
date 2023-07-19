package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    static final int RANGE_PROGRESSION = 10; //Step progression range
    static final int FIST_NUMBER_RANGE = 10; //Step progression range
    static final int NUMBERS_COUNT = 8; //Quantity of numbers in progression

    public static boolean playGame(String userName) {
        boolean result = true;
        int firstNumber;
        int indexHidingNumber;
        int stepProgression;
        String hidingNumber;

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            firstNumber = (int) (Math.random() * FIST_NUMBER_RANGE);
            stepProgression = (int) (Math.random() * RANGE_PROGRESSION);
            indexHidingNumber = (int) (Math.random() * NUMBERS_COUNT); //not first and not last
            StringJoiner question = new StringJoiner(" ");
            hidingNumber = "";

            for (int j = 0; j < NUMBERS_COUNT; j++) {

                if (j == indexHidingNumber) {
                    question.add("..");
                    hidingNumber = Integer.toString(firstNumber + stepProgression * j);
                } else {
                    question.add(Integer.toString(firstNumber + stepProgression * j));
                }
            }
            Engine.setQuestionAnswer(i, question.toString(), hidingNumber);
        }
        result = Engine.playGameEngine(userName);
        return result;
    }
}
