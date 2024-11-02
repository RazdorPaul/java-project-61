package hexlet.code.games;

import hexlet.code.Greet;

public class Prime {
    public static String startPrime(int gameCount, String nameUser) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var result = "Congratulations, " + nameUser + "!";
        for (var i = 0; i < gameCount; i++) {
            var quest = getQuestion();
            System.out.println("Question: " + quest);
            System.out.print("Your answer: ");
            var answer = Greet.userInput();
            var correctAnswer = getCorrectAnswer(quest);
            if (!answer.equals(correctAnswer)) {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'");
                result = "Let's try again, " + nameUser + "!";
                break;
            }
            System.out.println("Correct!");
        }
        return result;
    }

    public static String getQuestion() {
        final int maxValue = 99;
        int quest = (int) (Math.random() * maxValue) + 2;
        return Integer.toString(quest);
    }

    public static String getCorrectAnswer(String quest) {
        int number = Integer.parseInt(quest);
        String result = "yes";
        int delim = 2;
        while (delim < number) {
            if (number % delim == 0) {
                result = "no";
                break;
            }
            delim++;
        }
        return result;
    }
}
