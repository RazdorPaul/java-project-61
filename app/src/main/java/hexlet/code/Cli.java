package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void helloUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var nameUser = scan.next();
        scan.close();
        System.out.println("Hello, " + nameUser);
    }
}
