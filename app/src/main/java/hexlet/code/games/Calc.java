package hexlet.code.games;

public class Calc {
    public static String getQuestion() {
        int maxValue = 201;
        int operand1 = (int) (Math.random() * maxValue) - 100;
        int operand2 = (int) (Math.random() * maxValue) - 100;
        String quest = Integer.toString(operand1);
        switch ((int) (Math.random() * 3)) {
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

    public static String getAnswer(String quest) {
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
