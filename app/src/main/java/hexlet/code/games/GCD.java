package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class GCD {
    public static void startGCD(int gameCount) {
        Engine.setUserName("Find the greatest common divisor of given numbers.");
        String[][] gamedata = new String[gameCount][gameCount];
        for (var i = 0; i < gameCount; i++) {
            var number1 = Utils.getRandomInt(0, 100);
            var number2 = Utils.getRandomInt(0, 100);
            gamedata[i][0] = number1 + " " + number2;
            gamedata[i][1] = Integer.toString(getCorrectAnswer(number1, number2));
        }
        Engine.processGame(gamedata);
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
