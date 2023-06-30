package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;

public class App {
    public static void main(String[] args) {
        String userName = "";
        boolean playResult;

        System.out.println("Please enter the game number and press Enter.");
        // Menu Choice
        String userChoice = Cli.getUserAnswer("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n0 - Exit\nYour choice: ", "", "");
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
            default:
                //System.out.println("Exit");
                //return; //Exit

        }
    }
}
