package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Calc {
    static final int OPERATIONS_COUNT = 3;
    static final int RANGE = 100;
    public static boolean playGame(String userName) {
        boolean result = true;
        int operand1;
        int operand2;
        int operationRandomInt; // 0 - Sum, 1 - Subtraction, 2 - Multiply

        String[] questions = new String[App.QUESTIONS_COUNT];
        String[] rightAnswers = new String[App.QUESTIONS_COUNT];

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < App.QUESTIONS_COUNT; i++) {
            //Suppose Accurate probability from 0 to quantityOfOperations
            operationRandomInt = (int) (Math.random() * OPERATIONS_COUNT);
            //System.out.println("operationRandomInt :" + operationRandomInt);
            operand1 = (int) (Math.random() * RANGE);
            operand2 = (int) (Math.random() * RANGE);

            switch (operationRandomInt) {
                case 0:
                    questions[i] = operand1 + " + " + operand2;
                    rightAnswers[i] = Integer.toString(operand1 + operand2);
                    break;
                case 1:
                    questions[i] = operand1 + " - " + operand2;
                    rightAnswers[i] = Integer.toString(operand1 - operand2);
                    break;
                case 2:
                    questions[i] = operand1 + " * " + operand2;
                    rightAnswers[i] = Integer.toString(operand1 * operand2);
                    break;
                default:
                    RuntimeException caseException = new RuntimeException("Incorrect value of operation Calc");
                    System.out.println(caseException.fillInStackTrace().toString());
            }

        }
        result = Engine.playGameEngine(userName, questions, rightAnswers);
        return result;
    }
}
