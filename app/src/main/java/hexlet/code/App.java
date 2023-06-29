package hexlet.code;

public class App {
    public static void main(String[] args) {
        String userName = "";
        boolean playResult;

        System.out.println("Please enter the game number and press Enter.");
        // Menu Choice
        String userChoice = (String) Cli.getUserAnswer("1 - Greet\n2 - Even\n0 - Exit", "Your choice: ", "");
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
                userName = (String) Cli.getUserAnswer("May I have your name?", "Hello, ", "!");
            default:
        }
        switch (userChoice) {
            case "2":
                playResult = Even.playgame(userName);
                break;
            default:
                //System.out.println("Exit");
                //return; //Exit

        }
    }
}
