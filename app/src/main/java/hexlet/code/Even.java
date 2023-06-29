package hexlet.code;

import java.util.Scanner;

public class Even implements BrainGamePlay {
    //private static Scanner scanner;

    private static String getUserAnswer(Scanner scanner, String question, String printChoice) {
        String userChoice = "";

        //Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.print(printChoice);
        if (scanner.hasNextLine()) {
            userChoice = scanner.nextLine();
        } else {
            System.out.println("Sorry, Type of Your choice is unacceptable!");
        }
        return userChoice;
    }

    public static boolean playgame(String userName) {
        boolean result = true;
        int number;
        String rightAnswer;
        //String userName = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        //userName = (String) Cli.getUserAnswer("May I have your name?", "Hello, ","!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int attempt = 1; attempt <= 3; attempt++) {
            number = (int) (Math.random() * 1000);
            rightAnswer = number % 2 == 0 ? "yes" : "no";
            String userAnswer = getUserAnswer(scanner, "Question: " + number, "Your answer: ");
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                result = false;
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", userAnswer, rightAnswer);
                break;
            }
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
