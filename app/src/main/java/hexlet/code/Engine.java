package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static boolean checkUserAnswer(Scanner scanner,
                                           String questionString,
                                           String printChoice,
                                           String rightAnswer) {
        //return true if user give right Answer, otherwise false
        boolean result;
        String userAnswer = "";

        System.out.println(questionString);
        System.out.print(printChoice);
        if (scanner.hasNextLine()) {
            userAnswer = scanner.nextLine();
        } else {
            System.out.println("Sorry, Type of Your choice is unacceptable!");
        }
        if (userAnswer.toLowerCase().equals(rightAnswer.toLowerCase())) {
            result = true;
            System.out.println("Correct!");
        } else {
            result = false;
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", userAnswer, rightAnswer);
        }
        return result;
    }

    public static boolean playGameEngine(String userName, String[] questions, String[] rightAnswers) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length && result; i++) {
            result = checkUserAnswer(scanner, "Question: " + questions[i], "Your answer: ", rightAnswers[i]);
        }
        if (result) {
            System.out.println("Congratulations, " + userName);
        } else {
            System.out.println("Let's try again, " + userName);
        }
        scanner.close();
        return result;
    }
}
