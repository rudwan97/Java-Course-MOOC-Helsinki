
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int iterator = 0;

        // program your solution here. Do not touch the above lines!
        while (true) {
            System.out.println("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess > numberDrawn) {
                iterator++;
                System.out.println("The number is lesser, guesses made: " + iterator);
            } else {
                iterator++;
                System.out.println("The number is greater, guesses made: " + iterator);
            }

        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
