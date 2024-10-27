package hexlet.code.games;

public class GCD {
    public static String getQuestion() {
        final int MAX_VALUE = 100;
        String quest = Integer.toString((int) (Math.random() * MAX_VALUE) + 1) + " ";
        quest += Integer.toString((int) (Math.random() * MAX_VALUE) + 1);
        return quest;
    }

    public static String getAnswer(String quest) {
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
