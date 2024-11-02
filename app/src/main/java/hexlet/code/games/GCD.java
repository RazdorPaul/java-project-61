package hexlet.code.games;

import hexlet.code.Greet;

public class GCD {
    public static String startGCD(int gameCount, String nameUser) {
        System.out.println("Find the greatest common divisor of given numbers.");
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
        final int maxValue = 100;
        String quest = (int) (Math.random() * maxValue) + 1 + " ";
        quest += Integer.toString((int) (Math.random() * maxValue) + 1);
        return quest;
    }

    public static String getCorrectAnswer(String quest) {
        int num1 = Integer.parseInt(quest.split(" ")[0]);
        int num2 = Integer.parseInt(quest.split(" ")[1]);
        int gcd = Math.min(num1, num2);
        while (gcd > 0) {
            if (num1 % gcd == 0 & num2 % gcd == 0) {
                break;
            }
            gcd--;
        }
        return Integer.toString(gcd);
    }
}
