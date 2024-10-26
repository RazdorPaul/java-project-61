package hexlet.code;

import java.util.Scanner;

class Even {
    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        theGame(userName, sc);
        sc.close();;
    }

    private static void theGame(String name, Scanner sc) {
        int maxValue = 1001;
        for (var i = 0; i < 3; i++) {
            int numQuest = (int)(Math.random() * maxValue);
            String even = numQuest % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + numQuest);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (even.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                                    + "Correct answer was" + "'" + even + "'");
                System.out.println("Let's try again, " + name);
                return;
            }
        }
        System.out.println("Congratulations, " + name);
    }
}
