package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void startGCD(int gameCount) {
        Engine.setUserName("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < gameCount; i++) {
            var number1 = getNumber();
            var number2 = getNumber();
            var question = number1 + " " + number2;
            var answer = Engine.processGame(question);
            var correct = Integer.toString(getCorrectAnswer(number1, number2));
            if (!Engine.checkGame(answer, correct)) {
                return;
            }
        }
        Engine.winGame();
    }

    private static int getNumber() {
        final int maxValue = 100;
        return (int) (Math.random() * maxValue) + 1;
    }

    private static int getCorrectAnswer(int num1, int num2) {
        var gcd = Math.min(num1, num2);
        while (gcd > 0) {
            if (num1 % gcd == 0 & num2 % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }
}
