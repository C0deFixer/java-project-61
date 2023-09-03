package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String[] OPERATIONS = {"+", "-", "*"};

    private static final int RANGE = 100;

    public static final String RULES = "What is the result of the expression?";

    public static int sum(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int substraction(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public static int multiply(int operand1, int operand2) {
        return operand1 * operand2;
    }




    public static int calculateExpression(int operand1, int operand2, String operation) {
        int result;
        switch (operation) {
            case "+":
                result = sum(operand1, operand2);
                break;
            case "-":
                result = substraction(operand1, operand2);
                break;
            case "*":
                result = multiply(operand1, operand2);
                break;
            default:
                result = 0;
                RuntimeException caseException = new RuntimeException("Incorrect value of operation Calc:" + operation);
                System.out.println(caseException.fillInStackTrace().toString());
        }
        return result;
    }

    public static void playGame(String userName) {
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            //Suppose Accurate probability from 1 to quantityOfOperations
            int operationRandomInt = Utils.getRandomInt(0, OPERATIONS.length - 1); // 0 - Sum, 1 - Subtraction, 2 - Multiply
            //System.out.println("operationRandomInt :" + operationRandomInt);
            int operand1 = Utils.getRandomInt(1, RANGE);
            int operand2 = Utils.getRandomInt(1, RANGE);
            questions[i][Engine.INDEX_QUESTION] = operand1 + " " + OPERATIONS[operationRandomInt] + " " + operand2;
            questions[i][Engine.INDEX_ANSWER] = Integer.toString(calculateExpression(operand1, operand2, OPERATIONS[operationRandomInt]));
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
