package hexlet.code;

import hexlet.code.utils.Utils;

public class Engine {
    private static String username;

    public static void setUserName(String description) {
        username = Greet.greeting();
        System.out.println(description);
    }

    public static void processGame(String[][] data) {
        for (String[] strings : data) {
            System.out.println("Question: " + strings[0]);
            System.out.print("Your answer: ");
            var answer = Utils.userInput();
            if (!checkGame(answer, strings[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + strings[1] + "'");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + username + "!");
    }

    public static boolean checkGame(String userAnswer, String correctAnswer) {
        return userAnswer.equals(correctAnswer);
    }
}
