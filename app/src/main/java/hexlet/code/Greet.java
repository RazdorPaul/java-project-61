package hexlet.code;

import java.util.Scanner;

class Greet {
    public static String greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName);
        return userName;
    }

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
