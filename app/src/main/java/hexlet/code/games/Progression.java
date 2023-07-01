package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

public class Progression {

    public static boolean playGame(String userName) {
        int quantityOfQuestions = 3;
        boolean result = true;
        int firstMember;
        int firstMemberRange = 10;
        int indexHidingMember;
        int stepProgression;
        int quantityOfMembers = 8;

        String[] questions = new String[quantityOfQuestions];
        String[] rightAnswers = new String[quantityOfQuestions];

        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < quantityOfQuestions; i++) {
            firstMember = (int) (Math.random() * firstMemberRange);
            stepProgression = (int) (Math.random() * 10);
            indexHidingMember = (int) (Math.random() * (quantityOfMembers - 2)) + 1; //not first and not last
            StringJoiner question = new StringJoiner(" ");

            for (int j = 0; j < quantityOfMembers; j++) {

                if (j == indexHidingMember) {
                    question.add("..");
                    rightAnswers[i] = Integer.toString(firstMember + stepProgression * j);
                } else {
                    question.add(Integer.toString(firstMember + stepProgression * j));
                }
            }
            questions[i] = question.toString();
        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
