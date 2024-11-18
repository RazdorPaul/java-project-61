package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Calc {
    public static void startCalc(int gameCount) {
        Engine.setUserName("What is the result of the expression?");
        String[][] gamedata = new String[gameCount][gameCount];
        for (var i = 0; i < gameCount; i++) {
            var operand1 = Utils.getRandomInt(-100, 100);
            var operand2 = Utils.getRandomInt(-100, 100);
            var question = getQuestion(operand1, operand2);
            gamedata[i][0] = String.join(" ", question);
            gamedata[i][1] = Integer.toString(getCorrectAnswer(operand1, operand2, question[1]));
        }
        Engine.processGame(gamedata);
    }

    private static String[] getQuestion(int op1, int op2) {
        char[] operators = {'+', '-', '*'};
        int amountOperation = Utils.getRandomInt(0, 2);
        if ((op2 < 0) && operators[amountOperation] != '*') {
            op2 *= -1;
            if (operators[amountOperation] == '-') {
                amountOperation--;
            }
            if (operators[amountOperation] == '+') {
                amountOperation++;
            }
        }
        return new String[]{Integer.toString(op1),
                            Character.toString(operators[amountOperation]),
                            Integer.toString(op2)};
    }

    private static int getCorrectAnswer(int operand1, int operand2, String operator) {
        int result = 0;
        if (operator.equals("+")) {
            result = operand1 + operand2;
        }
        if (operator.equals("-")) {
            result = operand1 - operand2;
        }
        if (operator.equals("*")) {
            result = operand1 * operand2;
        }
        return result;
    }
}
