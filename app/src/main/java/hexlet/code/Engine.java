package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class Engine {
    static String username;

    public static void setGame() {
        int choiceGame;
        String[][] listGames = {
                {"1", " - Greet"},
                {"2", " - Even", "Answer 'yes' if the number is even, otherwise answer 'no'."},
                {"3", " - Calc", "What is the result of the expression?"},
                {"4", " - GCD", "Find the greatest common divisor of given numbers."},
                {"5", " - Progression", "What number is missing in the progression?"},
                {"6", " - Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'."},
                {"0", " - Exit"}
        };
        for (int i = 0; i < listGames.length; i++) {
            System.out.println("\t" + listGames[i][0] + listGames[i][1]);
        }
        System.out.print("Your choice: ");
        choiceGame = Greet.getChoice();
        if (choiceGame < 0 | choiceGame > listGames.length) {
            System.out.println("This game does not exist!");
            return;
        }
        if (choiceGame == 0) {
            return;
        }
        username = Greet.greeting();
        if (choiceGame == 1) {
            return;
        }
        startGame(listGames[choiceGame - 1][2], choiceGame);
    }

    public static void startGame(String title, int numGame) {
        System.out.println(title);
        String quest = "";
        String correctAnswer = "";
        String userAnswer = "";
        for (int i = 0; i < 3; i++) {
            if (numGame == 2) {
                quest = Even.getQuestion();
                correctAnswer = Even.getAnswer(quest);
            }
            if (numGame == 3) {
                quest = Calc.getQuestion();
                correctAnswer = Calc.getAnswer(quest);
            }
            if (numGame == 4) {
                quest = GCD.getQuestion();
                correctAnswer = GCD.getAnswer(quest);
            }
            if (numGame == 5) {
                quest = Progression.getQuestion();
                correctAnswer = Progression.getAnswer(quest);
            }
            if (numGame == 6) {
                quest = Prime.getQuestion();
                correctAnswer = Prime.getAnswer(quest);
            }
            System.out.println("Question: " + quest);
            System.out.print("Your answer: ");
            userAnswer = Greet.userInput();
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "'"
                                    + " is wrong answer ;(. Correct answer was "
                                    + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
