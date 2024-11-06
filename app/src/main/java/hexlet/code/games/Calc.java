package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startCalc(int gameCount) {
        Engine.setUserName("What is the result of the expression?");
        for (var i = 0; i < gameCount; i++) {
            var question = getQuestion();
            var answer = Engine.processGame(String.join(" ", question));
            var correct = Integer.toString(getCorrectAnswer(question));
            if (!Engine.checkGame(answer, correct)) {
                return;
            }
        }
        Engine.winGame();
    }

    private static String[] getQuestion() {
        final int maxValue = 200;
        final int minValue = -100;
        char[] operators = {'+', '-', '*'};
        int operand1 = (int) (Math.random() * maxValue) + minValue + 1;
        int operand2 = (int) (Math.random() * maxValue) + minValue + 1;
        int amountOperation = (int) (Math.random() * operators.length);
        if (operand2 < 0) {
            operand2 *= -1;
            if (operators[amountOperation] == '-') {
                amountOperation--;
            }
            if (operators[amountOperation] == '+') {
                amountOperation++;
            }
        }
        return new String[]{Integer.toString(operand1),
                            Character.toString(operators[amountOperation]),
                            Integer.toString(operand2)};
    }

    private static int getCorrectAnswer(String[] question) {
        int result = Integer.parseInt(question[0]);
        if (question[1].equals("+")) {
            result += Integer.parseInt(question[2]);
        }
        if (question[1].equals("-")) {
            result -= Integer.parseInt(question[2]);
        }
        if (question[1].equals("*")) {
            result *= Integer.parseInt(question[2]);
        }
        return result;
    }
}
