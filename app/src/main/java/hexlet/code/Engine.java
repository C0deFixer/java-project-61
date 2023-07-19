package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int QUESTIONS_COUNT = 3;
    public static final int QUESTIONS_PAIR = 2;
    public static final int INDEX_QUESTION = 0;
    public static final int INDEX_ANSWER = 1;
    private static String[][] questions = new String[Engine.QUESTIONS_COUNT][QUESTIONS_PAIR];
    public static void setQuestionAnswer(int questionPosition, String question, String answer) {
        questions[questionPosition][INDEX_QUESTION] = question;
        questions[questionPosition][INDEX_ANSWER] = answer;
    }

    public static boolean checkUserAnswer(Scanner scanner,
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
        if (userAnswer.equalsIgnoreCase(rightAnswer)) {
            result = true;
            System.out.println("Correct!");
        } else {
            result = false;
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'%n", userAnswer, rightAnswer);
        }
        return result;
    }

    public static boolean playGameEngine(String userName) {
        boolean result = true;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length && result; i++) {
            result = checkUserAnswer(scanner, "Question: " + questions[i][INDEX_QUESTION],
                    "Your answer: ", questions[i][INDEX_ANSWER]);
        }
        if (result) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
        scanner.close();
        return result;
    }
}
