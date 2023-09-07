package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_COUNT = 3;
    public static final int QUESTIONS_PAIR = 2;
    public static final int INDEX_QUESTION = 0;
    public static final int INDEX_ANSWER = 1;

    public static void playGameEngine(String userName, String rules, String[][] questions) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(rules);

        for (String[] question : questions) {
            String userAnswer = "";
            System.out.print("Question: " + question[INDEX_QUESTION] + "\nYour answer: ");

            if (scanner.hasNextLine()) {
                userAnswer = scanner.nextLine();
            } else {
                System.out.println("Sorry, Type of Your choice is unacceptable!");
            }
            if (userAnswer.equalsIgnoreCase(question[INDEX_ANSWER])) {
                System.out.println("Correct!");
            } else {
                result = false;
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n",
                        userAnswer, question[INDEX_ANSWER]);
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
        scanner.close();
    }
}
