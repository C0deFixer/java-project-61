package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Even {
    static final int RANGE = 100;// range int from 0 to 1000
    public static boolean playGame(String userName) {
        boolean result = true;
        int number;

        String[] questions = new String[App.QUESTIONS_COUNT];
        String[] rightAnswers = new String[App.QUESTIONS_COUNT];

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < App.QUESTIONS_COUNT; i++) {
            number = (int) (Math.random() * RANGE);
            questions[i] = Integer.toString(number);
            rightAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }

}
