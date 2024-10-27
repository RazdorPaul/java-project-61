package hexlet.code.games;

public class Even {

    public static String getQuestion() {
        var maxValue = 1001;
        var numQuest = (int)(Math.random() * maxValue);
        return Integer.toString(numQuest);
    }

    public static String getAnswer(String quest) {
        return Integer.parseInt(quest) % 2 == 0 ? "yes" : "no";
    }
}
