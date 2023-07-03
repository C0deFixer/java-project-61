package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {
    static final int RANGE_PROGRESSION = 10; //Step progression range
    static final int FIST_NNUMBER_RANGE = 10; //Step progression range
    static final int NUMBERS_COUNT = 8; //Quantity of numbers in progression
    public static boolean playGame(String userName) {
        boolean result = true;
        int firstNumber;
        int indexHidingNumber;
        int stepProgression;

        String[] questions = new String[App.QUESTIONS_COUNT];
        String[] rightAnswers = new String[App.QUESTIONS_COUNT];

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < App.QUESTIONS_COUNT; i++) {
            firstNumber = (int) (Math.random() * FIST_NNUMBER_RANGE);
            stepProgression = (int) (Math.random() * RANGE_PROGRESSION);
            indexHidingNumber = (int) (Math.random() * NUMBERS_COUNT); //not first and not last
            StringJoiner question = new StringJoiner(" ");

            for (int j = 0; j < NUMBERS_COUNT; j++) {

                if (j == indexHidingNumber) {
                    question.add("..");
                    rightAnswers[i] = Integer.toString(firstNumber + stepProgression * j);
                } else {
                    question.add(Integer.toString(firstNumber + stepProgression * j));
                }
            }
            questions[i] = question.toString();
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
