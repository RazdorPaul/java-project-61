package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class Engine {
    private static String username;

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
        for (String[] listGame : listGames) {
            System.out.println("\t" + listGame[0] + listGame[1]);
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
        startGame(listGames[choiceGame - 1]);
    }

    public static void startGame(String[] game) {
        final int countGame = 3;
        System.out.println(game[2]);
        String quest = "";
        String correctAnswer = "";
        String userAnswer;
        for (int i = 0; i < countGame; i++) {
            switch (Integer.parseInt(game[0])) {
                case 2 -> {
                    quest = Even.getQuestion();
                    correctAnswer = Even.getAnswer(quest);
                }
                case 3 -> {
                    quest = Calc.getQuestion();
                    correctAnswer = Calc.getAnswer(quest);
                }
                case 4 -> {
                    quest = GCD.getQuestion();
                    correctAnswer = GCD.getAnswer(quest);
                }
                case 5 -> {
                    quest = Progression.getQuestion();
                    correctAnswer = Progression.getAnswer(quest);
                }
                case 6 -> {
                    quest = Prime.getQuestion();
                    correctAnswer = Prime.getAnswer(quest);
                }
                default -> { }
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
