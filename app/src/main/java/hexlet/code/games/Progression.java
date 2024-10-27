package hexlet.code.games;

public class Progression {
    public static String getQuestion() {
        final int size = 10;
        final int maxValue = 101;
        final int shift = 50;

        int startItem = (int) (Math.random() * maxValue - shift);
        int step = (int) (Math.random() * (size + 1));
        int hidden = (int) (Math.random() * size);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
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
