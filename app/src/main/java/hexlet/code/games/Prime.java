package hexlet.code.games;

public class Prime {
    public static String getQuestion() {
        int maxValue = 99;
        int quest = (int) (Math.random() * maxValue) + 2;
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
