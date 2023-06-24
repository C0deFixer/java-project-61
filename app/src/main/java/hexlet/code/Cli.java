package hexlet.code;
import  java.util.Scanner;
public class Cli {
    public static String enterYouName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = "";
        if (scanner.hasNextLine()) {
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Sorry, You name is not a string!");
        }
        scanner.close();
        return userName;
    }
}
