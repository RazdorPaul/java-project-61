package hexlet.code.games;

import hexlet.code.Greet;

public class Calc {
    public static String startCalc(int gameCount, String nameUser) {
        System.out.println("What is the result of the expression?");
        var result = "Congratulations, " + nameUser + "!";
        for (var i = 0; i < gameCount; i++) {
            var quest = getQuestion();
            System.out.println("Question: " + quest);
            System.out.print("Your answer: ");
            var answer = Greet.userInput();
            var correctAnswer = getCorrectAnswer(quest);
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'");
                result = "Let's try again, " + nameUser + "!";
                break;
            }
            System.out.println("Correct!");
        }
        return result;
    }

    private static String getQuestion() {

        final int maxValue = 201;
        final int shiftBorder = 100;
        final int amountOperation = 3;

        int operand1 = (int) (Math.random() * maxValue) - shiftBorder;
        int operand2 = (int) (Math.random() * maxValue) - shiftBorder;
        String quest = Integer.toString(operand1);
        switch ((int) (Math.random() * amountOperation)) {
            case 0 -> {
                if (operand2 < 0) {
                    operand2 *= -1;
                    quest += " - ";
                } else {
                    quest += " + ";
                }
            }
            case 1 -> {
                if (operand2 < 0) {
                    operand2 *= -1;
                    quest += " + ";
                } else {
                    quest += " - ";
                }
            }
            case 2 -> {
                quest += " * ";
            }
            default -> { }
        }

        quest += Integer.toString(operand2);
        return quest;
    }

    private static String getCorrectAnswer(String quest) {
        String[] expression = quest.split(" ");
        int result = Integer.parseInt(expression[0]);
        if (expression[1].equals("+")) {
            result += Integer.parseInt(expression[2]);
        }
        if (expression[1].equals("-")) {
            result -= Integer.parseInt(expression[2]);
        }
        if (expression[1].equals("*")) {
            result *= Integer.parseInt(expression[2]);
        }
        return Integer.toString(result);
    }
}
