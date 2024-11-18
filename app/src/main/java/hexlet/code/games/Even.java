package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Even {

    public static void startEven(int countGames) {
        Engine.setUserName("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[][] gamedata = new String[countGames][countGames];
        for (var i = 0; i < countGames; i++) {
            var quest = Utils.getRandomInt(0, 1000);
            gamedata[i][0] = Integer.toString(quest);
            gamedata[i][1] = isEven(quest) ? "yes" : "no";
        }
        Engine.processGame(gamedata);
    }

    private static boolean isEven(int quest) {
        return quest % 2 == 0;
    }
}
