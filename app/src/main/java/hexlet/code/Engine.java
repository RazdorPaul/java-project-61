package hexlet.code;

public class Engine {
    private static String username;

    public static void setUserName(String description) {
        username = Greet.greeting();
        System.out.println(description);
    }

    public static String processGame(String question) {
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        return Greet.userInput();
    }

    public static boolean checkGame(String userAnswer, String correctAnswer) {
        if (!userAnswer.equals(correctAnswer)) {
            System.out.println("'" + userAnswer + "'"
                    + " is wrong answer ;(. Correct answer was "
                    + "'" + correctAnswer + "'");
            System.out.println("Let's try again, " + username + "!");
        } else {
            System.out.println("Correct!");
        }
        return userAnswer.equals(correctAnswer);
    }

    public static void winGame() {
        System.out.println("Congratulations, " + username + "!");
    }
}
