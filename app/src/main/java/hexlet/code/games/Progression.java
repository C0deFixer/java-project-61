package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {

    public static boolean playGame(String userName) {
        int questionsCount = 3;
        boolean result = true;
        int firstNumber;
        int firstNumberRange = 10;
        int indexHidingNumber;
        int stepProgression;
        int numbersCount = 8;

        String[] questions = new String[questionsCount];
        String[] rightAnswers = new String[questionsCount];

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < questionsCount; i++) {
            firstNumber = (int) (Math.random() * firstNumberRange);
            stepProgression = (int) (Math.random() * 10);
            indexHidingNumber = (questionsCount - 2) + 1; //not first and not last
            StringJoiner question = new StringJoiner(" ");

            for (int j = 0; j < numbersCount; j++) {

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
