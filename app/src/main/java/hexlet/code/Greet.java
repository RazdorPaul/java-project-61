package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Your input is incorrect!");
        }
        return choice;
    }
}
