package hexlet.code;

import java.util.Scanner;

public class Cli {
    // preamble - print Question before enter
    // printChoice  - print "Your choice" after enter choice
    public static String getUserAnswer(String question, String printChoice, String postFix) {
        String userChoice = "";
        System.out.print(question);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            userChoice = scanner.nextLine();
            if (!printChoice.isBlank()) {
                //System.out.printf("%s%s%s\n", printChoice, userChoice, postFix);
                System.out.printf("%s%s%s\n", printChoice, userChoice, postFix);
            }
        } else {
            userChoice = "0";
            System.out.println("Sorry, Type of Your choice is unacceptable!");
        }
        return userChoice;
    }
}
