package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Even {

    public static void startEven() {
        final int maxValue = 1000;
        String descript = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gamedata = new String[Engine.MAX_COUNT][Engine.DATA_SIZE];
        for (var i = 0; i < gamedata.length; i++) {
            var quest = Utils.getRandomInt(0, maxValue);
            gamedata[i][0] = Integer.toString(quest);
            gamedata[i][1] = isEven(quest) ? "yes" : "no";
        }
        Engine.processGame(gamedata, descript);
    }

    private static boolean isEven(int quest) {
        return quest % 2 == 0;
    }
}
