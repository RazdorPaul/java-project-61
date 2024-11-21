package hexlet.code;

import hexlet.code.utils.Utils;

public class Engine {
    public static final int MAX_COUNT = 3;
    public static final int DATA_SIZE = 2;

    public static void processGame(String[][] data, String descript) {
        String username = Greet.greeting();
        System.out.println(descript);
        for (String[] strings : data) {
            System.out.println("Question: " + strings[0]);
            System.out.print("Your answer: ");
            var answer = Utils.userInput();
            if (!answer.equals(strings[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + strings[1] + "'");
                System.out.println("Let's try again, " + username + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
