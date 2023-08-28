package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int OPERATIONS_COUNT = 2;
    static final int RANGE = 100;

    public static String sum(int operand1, int operand2) {
        return Integer.toString(operand1 + operand2);
    }

    public static String substraction(int operand1, int operand2) {
        return Integer.toString(operand1 - operand2);
    }

    public static String multiply(int operand1, int operand2) {
        return Integer.toString(operand1 * operand2);
    }

    static final String RULES = "What is the result of the expression?";

    public static String getOperationString(int operation) {
        String result = "";
        switch (operation) {
            case 1:
                result = " + ";
                break;
            case 2:
                result = " - ";
                break;
            case 3:
                result = " * ";
            default:
                RuntimeException caseException = new RuntimeException("Incorrect value of operation Calc:" + operation);
                System.out.println(caseException.fillInStackTrace().toString());
        }
        return result;
    }
    public static String calculateExpression(int operand1, int operand2, int operation) {
        String result = "";
        switch (operation) {
            case 1:
                result = sum(operand1, operand2);
                break;
            case 2:
                result = substraction(operand1, operand2);
                break;
            case 3:
                result = multiply(operand1, operand2);
            default:
                RuntimeException caseException = new RuntimeException("Incorrect value of operation Calc:" + operation);
                System.out.println(caseException.fillInStackTrace().toString());
        }
        return result;
    }
    public static void playGame(String userName) {
        boolean result = true;
        int operand1;
        int operand2;
        int operationRandomInt; // 1 - Sum, 2 - Subtraction, 3 - Multiply
        String[][] questions = new String[Engine.QUESTIONS_COUNT][Engine.QUESTIONS_PAIR];

        for (int i = 0; i < Engine.QUESTIONS_COUNT; i++) {
            //Suppose Accurate probability from 1 to quantityOfOperations
            operationRandomInt = Utils.getRandomInt(1, OPERATIONS_COUNT);
            //System.out.println("operationRandomInt :" + operationRandomInt);
            operand1 = Utils.getRandomInt(1, RANGE);
            operand2 = Utils.getRandomInt(1, RANGE);
            Engine.setQuestionAnswer(questions, i,
                    operand1 + getOperationString(operationRandomInt) + operand2,
                    calculateExpression(operand1, operand2, operationRandomInt));
        }
        Engine.playGameEngine(userName, RULES, questions);
    }
}
