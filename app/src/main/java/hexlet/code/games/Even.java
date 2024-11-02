package hexlet.code.games;

import hexlet.code.Greet;

public class Even {

    public static String startEven(int gameCount, String nameUser) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
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

    private static String getQuestion() {
        final int maxValue = 1001;
        var numQuest = (int) (Math.random() * maxValue);
        return Integer.toString(numQuest);
    }

    private static String getCorrectAnswer(String quest) {
        return Integer.parseInt(quest) % 2 == 0 ? "yes" : "no";
    }
}
