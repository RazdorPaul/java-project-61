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
}
