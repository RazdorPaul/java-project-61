package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class Engine {
    public static void startGame(String game, String username) {
        final int countGame = 3;
        switch (game) {
            case "Even" -> System.out.println(Even.startEven(countGame, username));
            case "Calc" -> System.out.println(Calc.startCalc(countGame, username));
            case "GCD" -> System.out.println(GCD.startGCD(countGame, username));
            case "Progression" -> System.out.println(Progression.startProgression(countGame, username));
            case "Prime" -> System.out.println(Prime.startPrime(countGame, username));
            default -> { }
        }
    }
}
