package hexlet.code.games;

import hexlet.code.Greet;

public class Progression {
    public static String startProgression(int gameCount, String nameUser) {
        System.out.println("What number is missing in the progression?");
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
        final int size = 10;
        final int maxValue = 101;
        final int shift = 50;

        int startItem = (int) (Math.random() * maxValue - shift);
        int step = (int) (Math.random() * (size + 1));
        int hidden = (int) (Math.random() * size);
        String[] result = new String[size];
        for (int i = 0; i < size; i++) {
            var item = i * step + startItem;
            result[i] = Integer.toString(item);
        }
        result[hidden] = "..";
        return String.join(" ", result);
    }

    public static String getCorrectAnswer(String quest) {
        String[] numbers = quest.split(" ");
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("..")) {
                if (i == 0) {
                    answer = Integer.parseInt(numbers[i + 2]) - Integer.parseInt(numbers[i + 1]);
                    answer = Integer.parseInt(numbers[i + 1]) - answer;
                }
                if (i > 0 && i < numbers.length - 1) {
                    int prev = Integer.parseInt(numbers[i - 1]);
                    int next = Integer.parseInt(numbers[i + 1]);
                    answer = (next + prev) / 2;
                }
                if (i == numbers.length - 1) {
                    answer = Integer.parseInt(numbers[i - 1]) - Integer.parseInt(numbers[i - 2]);
                    answer += Integer.parseInt(numbers[i - 1]);
                }
            }
        }
        return Integer.toString(answer);
    }
}
