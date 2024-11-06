package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void startPrime(int gameCount) {
        Engine.setUserName("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < gameCount; i++) {
            var question = getQuestion();
            var answer = Engine.processGame(Integer.toString(question));
            var correct = isPrime(question) ? "yes" : "no";
            if (!Engine.checkGame(answer, correct)) {
                return;
            }
        }
        Engine.winGame();
    }

    private static int getQuestion() {
        final int maxValue = 101;
        return (int) (Math.random() * maxValue) + 1;
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
