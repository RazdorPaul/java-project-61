package hexlet.code;

import hexlet.code.utils.Utils;

public class Greet {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = Utils.userInput();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }


}
