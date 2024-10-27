package hexlet.code.games;

public class Calc {

    public static String getQuestion() {
        final int MAX_VALUE = 201;
        final int SHIFT_BORDER = 100;
        final int AMOUNT_OPERATION = 3;

        int operand1 = (int) (Math.random() * MAX_VALUE) - SHIFT_BORDER;
        int operand2 = (int) (Math.random() * MAX_VALUE) - SHIFT_BORDER;
        String quest = Integer.toString(operand1);
        switch ((int) (Math.random() * AMOUNT_OPERATION)) {
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
