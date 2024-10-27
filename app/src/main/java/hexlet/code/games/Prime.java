package hexlet.code.games;

public class Prime {
    public static String getQuestion() {
        final int MAX_VALUE = 99;
        int quest = (int) (Math.random() * MAX_VALUE) + 2;
        return Integer.toString(quest);
    }

    public static String getAnswer(String quest) {
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
