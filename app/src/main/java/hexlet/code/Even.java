package hexlet.code;

import java.util.Scanner;

class Even {
    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        sc.close();
        System.out.println("Hello, " + userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

    }

    private static void theGame() {
        int MAX = 1000;
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < 3; i++) {
            int numQuest = (int)(Math.random() * MAX) + 1;
            System.out.println("Qestion:" + numQuest);
            System.out.print("Your answer: ");
            String answer = sc.next();
        }
    }
}