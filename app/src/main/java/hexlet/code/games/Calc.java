package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Calc {
    public static void startCalc(int gameCount) {
        Engine.setUserName("What is the result of the expression?");
        String[][] gamedata = new String[gameCount][gameCount];
        char[] operators = {'+', '-', '*'};
        final int minValue = -100;
        final int maxValue = 100;
        final int indexOperatorMax = 2;
        for (var i = 0; i < gameCount; i++) {
            var operand1 = Utils.getRandomInt(minValue, maxValue);
            var operand2 = Utils.getRandomInt(minValue, maxValue);
            var operator = Utils.getRandomInt(0, indexOperatorMax);
            var question = getQuestion(operand1, operand2, operators[operator]);
            gamedata[i][0] = String.join(" ", question);
            gamedata[i][1] = Integer.toString(getCorrectAnswer(operand1, operand2, operators[operator]));
        }
        Engine.processGame(gamedata);
    }

    private static String[] getQuestion(int op1, int op2, char operator) {
        if ((op2 < 0) && operator != '*') {
            op2 *= -1;
            operator = operator == '-' ? '+' : '-';
        }
        return new String[]{Integer.toString(op1),
                            Character.toString(operator),
                            Integer.toString(op2)};
    }

    private static int getCorrectAnswer(int operand1, int operand2, char operator) {
        int result = 0;
        if (operator == '+') {
            result = operand1 + operand2;
        }
        if (operator == '-') {
            result = operand1 - operand2;
        }
        if (operator == '*') {
            result = operand1 * operand2;
        }
        return result;
    }
}
