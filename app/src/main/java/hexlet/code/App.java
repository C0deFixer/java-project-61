package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        String userName = "";
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
        switch (userChoice) {
            case "":
            case "0":
                return; //Exit
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
                userName = Cli.getUserAnswer("May I have your name? ", "Hello, ", "!");
                System.out.println("Welcome to the Brain Games!");
            default:
        }
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
                //System.out.println("Exit");
                //return; //Exit

        }
    }
}
