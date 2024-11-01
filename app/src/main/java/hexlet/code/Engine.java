package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

class Engine {
    public static void startGame(String[] game, String username) {
        final int countGame = 3;
        String nameGame = game[1].trim().split(" ")[1];
        System.out.println(game[2]);
        String quest = "";
        String correctAnswer = "";
        String userAnswer;
        for (int i = 0; i < countGame; i++) {
            if (nameGame.equals("Even")) {
                quest = Even.getQuestion();
                correctAnswer = Even.getAnswer(quest);
            }
            if (nameGame.equals("Calc")) {
                quest = Calc.getQuestion();
                correctAnswer = Calc.getAnswer(quest);
            }
            if (nameGame.equals("GCD")) {
                quest = GCD.getQuestion();
                correctAnswer = GCD.getAnswer(quest);
            }
            if (nameGame.equals("Progression")) {
                quest = Progression.getQuestion();
                correctAnswer = Progression.getAnswer(quest);
            }
            if (nameGame.equals("Prime")) {
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
