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
        System.out.println("\t1 - Greet\n"
                        + "\t2 - Even\n"
                        + "\t3 - Calc\n"
                        + "\t4 - GCD\n"
                        + "\t5 - Progression\n"
                        + "\t6 - Prime\n"
                        + "\t0 - Exit");
        System.out.print("Your choice: ");
        int choiceGame = Greet.getChoice();
        switch (choiceGame) {
            case 0 -> {
                return;
            }
            case 1 -> Greet.greeting();
            case 2 -> Even.startEven(countGames);
            case 3 -> Calc.startCalc(countGames);
            case 4 -> GCD.startGCD(countGames);
            case 5 -> Progression.startProgression(countGames);
            case 6 -> Prime.startPrime(countGames);
            default -> System.out.println("This game is not exist!!!");
        }
    }
}
