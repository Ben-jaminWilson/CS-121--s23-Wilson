package activity7;

import java.util.Scanner;

public class activity_7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 52;
        int Guesses = 0;
        while (true) {
            System.out.println("Enter a number between 1 and 100 or 'q' to quit:");
            String input = keyboard.nextLine();

            if (input.equals("q")) {
                System.out.println("Quitting the game.");
                break;
            }
            int guess = Integer.parseInt(input);
            if (guess < number) {
                System.out.println("wrong guess, you are low");
                Guesses++;

            } else if (guess > number) {
                System.out.println("wrong guess,you are high");
            } else {
                System.out.println("correct, have a cookie");
                System.out.println("number of guesses:" + Guesses);
            }

        }
    }
}