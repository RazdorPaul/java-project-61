package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Progression {
    public static void startProgression(int gameCount) {
        Engine.setUserName("What number is missing in the progression?");
        String[][] gamedata = new String[gameCount][gameCount];
        var sizeProgression = Utils.getRandomInt(5, 10);
        for (var i = 0; i < gameCount; i++) {
            var step = Utils.getRandomInt(1, 10);
            var startValue = Utils.getRandomInt(-100, 100);
            var hidden = Utils.getRandomInt(0, sizeProgression);
            var numbers = getProgression(startValue, step, sizeProgression);
            String[] question = new String[numbers.length];
            for (var j = 0; j < question.length; j++) {
                question[j] = Integer.toString(numbers[j]);
            }
            question[hidden] = "..";
            gamedata[i][0] = String.join(" ", question);
            gamedata[i][1] = Integer.toString(numbers[hidden]);
        }
        Engine.processGame(gamedata);
    }

    private static int[] getProgression(int start, int step, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = start + i * step;
        }
        return numbers;
    }
}
