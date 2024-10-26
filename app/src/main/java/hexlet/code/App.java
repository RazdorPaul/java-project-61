package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter. ");
        System.out.print("1 - Greet\n"
                         + "2 - Even\n"
                         +  "0 - Exit\n"
                         + "Your choice: ");
        Scanner sc = new Scanner(System.in);
        var numGame = sc.next();
        switch (numGame) {
            case "0" : {
                break;
            }
            case "1" : {
                break;
            }
            case "2" : {
                Even.gameEven();
                break;
            }
            default:
                System.out.println("This game is not exist! Program close!");
        }
        System.out.println("Goodbye, program is done!");
    }
}
