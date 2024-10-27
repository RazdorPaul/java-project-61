package hexlet.code.games;

public class Progression {
    public static String getQuestion() {
        final int SIZE = 10;
        final int MAX_VALUE = 101;
        final int SHIFT = 50;

        int startItem = (int) (Math.random() * MAX_VALUE - SHIFT);
        int step = (int) (Math.random() * (SIZE + 1));
        int hidden = (int) (Math.random() * SIZE);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (i == hidden) {
                result.append(".." + " ");
            } else {
                result.append(Integer.toString(startItem + step * i)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public static String getAnswer(String quest) {
        String[] numbers = quest.split(" ");
        int answer = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("..")) {
                if (i == 0) {
                    answer = Integer.parseInt(numbers[i + 2]) - Integer.parseInt(numbers[i + 1]);
                    answer = Integer.parseInt(numbers[i + 1]) - answer;
                }
                if (i > 0 & i < numbers.length - 1) {
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
