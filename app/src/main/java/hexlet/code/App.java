package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        int countGames = 3;
        System.out.println("Please enter the game number and press Enter. ");
        String[][] listGames = {
                {"1", "Greet"},
                {"2", "Even"},
                {"3", "Calc"},
                {"4", "GCD"},
                {"5", "Progression"},
                {"6", "Prime"},
                {"0", "Exit"}
        };
        for (String[] listGame : listGames) {
            System.out.println("\t" + listGame[0] + " - " + listGame[1]);
        }
        System.out.print("Your choice: ");
        int choiceGame = Greet.getChoice();
        if (choiceGame == 0) {
            return;
        }
        switch (listGames[choiceGame - 1][1]) {
            case "Greet" -> Greet.greeting();
            case "Even" -> Even.startEven(countGames);
            case "Calc" -> Calc.startCalc(countGames);
            case "GCD" -> GCD.startGCD(countGames);
            case "Progression" -> Progression.startProgression(countGames);
            case "Prime" -> Prime.startPrime(countGames);
            default -> System.out.println("This game is not exist!!!");
        }
    }
}
