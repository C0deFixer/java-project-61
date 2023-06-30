package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static boolean playGame(String userName) {
        int quantityOfQuestions = 3;
        int quantityOfOperations = 3;
        boolean result = true;
        int operand1;
        int operand2;
        int operationRandomInt; // 0 - Sum, 1 - Subtraction, 2 - Multiply

        String[] questions = new String[quantityOfQuestions];
        String[] rightAnswers = new String[quantityOfQuestions];

        System.out.println("What is the result of the expression?");
        for (int i = 0; i < quantityOfQuestions; i++) {
            //Suppose Accurate probability from 0 to quantityOfOperations
            operationRandomInt = (int) (Math.random() * quantityOfOperations);
            //System.out.println("operationRandomInt :" + operationRandomInt);
            operand1 = (int) (Math.random() * 100);
            operand2 = (int) (Math.random() * 100);

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
