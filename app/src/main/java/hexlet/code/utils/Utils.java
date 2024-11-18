package hexlet.code.utils;

import java.util.Scanner;

public class Utils {
    public static int getRandomInt(int low, int high) {
        high++;
        high -= low;
        return (int) (Math.random() * high) + low;
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
