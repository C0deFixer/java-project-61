package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String userName = "";
        Scanner scanner = new Scanner(System.in);
        boolean playResult;

        System.out.println("Please enter the game number and press Enter.");
        // Menu Choice
        String userChoice = Cli.getUserAnswer("1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "4 - GCD\n"
                        + "5 - Progression\n"
                        + "6 - Prime\n"
                        + "0 - Exit\n"
                        + "Your choice: ",
                "",
                "");
        if (userChoice.equals("0")) {
            return;
        }
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        if (scanner.hasNextLine()) {
            userName = scanner.nextLine();
            userName = !userName.isBlank() ? userName : "Anonim";
        }
        System.out.println("Hello, " + userName + "!");
        switch (userChoice) {
            case "2":
                playResult = Even.playGame(userName);
                break;
            case "3":
                playResult = Calc.playGame(userName);
                break;
            case "4":
                playResult = GCD.playGame(userName);
                break;
            case "5":
                playResult = Progression.playGame(userName);
                break;
            case "6":
                playResult = Prime.playGame(userName);
                break;
            default:
                return; //Exit
        }

    }
}
