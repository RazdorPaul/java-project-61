package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void startEven(int countGames) {
        Engine.setUserName("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < countGames; i++) {
            var question = getQuestion();
            var answer = Engine.processGame(Integer.toString(question));
            var correct = isEven(question) ? "yes" : "no";
            if (!Engine.checkGame(answer, correct)) {
                return;
            }
        }
        Engine.winGame();
    }

    private static int getQuestion() {
        int maxValue = 1000;
        return (int) (Math.random() * maxValue) + 1;
    }

    private static boolean isEven(int quest) {
        return quest % 2 == 0;
    }
}
