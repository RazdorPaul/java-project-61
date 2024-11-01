package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. ");
        String[][] listGames = {
                {"1", " - Greet"},
                {"2", " - Even", "Answer 'yes' if the number is even, otherwise answer 'no'."},
                {"3", " - Calc", "What is the result of the expression?"},
                {"4", " - GCD", "Find the greatest common divisor of given numbers."},
                {"5", " - Progression", "What number is missing in the progression?"},
                {"6", " - Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'."},
                {"0", " - Exit"}
        };
        for (String[] listGame : listGames) {
            System.out.println("\t" + listGame[0] + listGame[1]);
        }
        System.out.print("Your choice: ");
        int choiceGame = Greet.getChoice();
        if (choiceGame < 0 | choiceGame > listGames.length) {
            System.out.println("This game does not exist!");
            return;
        }
        if (choiceGame == 0) {
            return;
        }
        String username = Greet.greeting();
        if (choiceGame == 1) {
            return;
        }
        Engine.startGame(listGames[choiceGame - 1], username);
    }
}
