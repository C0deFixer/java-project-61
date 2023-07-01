package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static boolean playGame(String userName) {
        int questionsCount = 3;
        boolean result = true;
        int range = 1000; // range int from 0 to 1000
        int number;

        String[] questions = new String[questionsCount];
        String[] rightAnswers = new String[questionsCount];

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < questionsCount; i++) {
            number = (int) (Math.random() * range);
            questions[i] = Integer.toString(number);
            rightAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }

}