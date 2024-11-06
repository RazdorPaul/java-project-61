package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void startProgression(int gameCount) {
        Engine.setUserName("What number is missing in the progression?");
        final int sizeProgression = 10;
        final int maxStep = 10;
        final int minValueStart = -100;
        final int maxValueStart = 100;
        final int hiddenMax = 10;
        for (var i = 0; i < gameCount; i++) {
            var start = (int) (Math.random() * (maxValueStart - minValueStart)) + minValueStart;
            var step = (int) (Math.random() * maxStep) + 1;
            var numbers = getProgression(start, step, sizeProgression);
            String[] question = new String[numbers.length];
            for (var j = 0; j < question.length; j++) {
                question[j] = Integer.toString(numbers[j]);
            }
            var hidden = (int) (Math.random() * hiddenMax);
            question[hidden] = "..";
            var answer = Engine.processGame(String.join(" ", question));
            var correct = Integer.toString(getHidden(numbers, hidden));
            if (!Engine.checkGame(answer, correct)) {
                return;
            }
        }
        Engine.winGame();
    }

    private static int[] getProgression(int start, int step, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = start + i * step;
        }
        return numbers;
    }

    private static int getHidden(int[] question, int hidden) {
        return question[hidden];
    }
}
