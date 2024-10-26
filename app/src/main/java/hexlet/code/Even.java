package hexlet.code;

class Even {
    public static void gameEven() {
        String userName = Greet.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int maxValue = 1001;
        for (var i = 0; i < 3; i++) {
            int numQuest = (int)(Math.random() * maxValue);
            String even = numQuest % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + numQuest);
            System.out.print("Your answer: ");
            String answer = Greet.userInput();
            if (even.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was" + "'" + even + "'");
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
