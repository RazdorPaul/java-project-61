package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Prime {
    public static void startPrime(int gameCount) {
        Engine.setUserName("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[][] gamedata = new String[gameCount][gameCount];
        final int minValue = 2;
        final int maxValue = 150;
        for (var i = 0; i < gameCount; i++) {
            var question = Utils.getRandomInt(minValue, maxValue);
            gamedata[i][0] = Integer.toString(question);
            gamedata[i][1] = isPrime(question) ? "yes" : "no";
        }
        Engine.processGame(gamedata);
    }

    private static boolean isPrime(int question) {
        var prime = true;
        int delim = 2;
        while (delim < question) {
            if (question % delim == 0) {
                prime = false;
                break;
            }
            delim++;
        }
        return prime;
    }
}
