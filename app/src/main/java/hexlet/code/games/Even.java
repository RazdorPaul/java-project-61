package hexlet.code.games;

public class Even {
    public static int quest;

    public static String Question() {
        int maxValue = 1001;
        int numQuest = (int)(Math.random() * maxValue);
        return Integer.toString(numQuest);
    }

    public static String correctAnswer(String quest) {
        return Integer.parseInt(quest) % 2 == 0 ? "yes" : "no";
    }
}
