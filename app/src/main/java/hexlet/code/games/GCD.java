package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class GCD {
    public static void startGCD() {
        final int max = 100;
        final int min = 1;
        String descript = "Find the greatest common divisor of given numbers.";
        String[][] gamedata = new String[Engine.MAX_COUNT][Engine.DATA_SIZE];
        for (var i = 0; i < gamedata.length; i++) {
            var number1 = Utils.getRandomInt(min, max);
            var number2 = Utils.getRandomInt(min, max);
            gamedata[i][0] = number1 + " " + number2;
            gamedata[i][1] = Integer.toString(getCorrectAnswer(number1, number2));
        }
        Engine.processGame(gamedata, descript);
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
