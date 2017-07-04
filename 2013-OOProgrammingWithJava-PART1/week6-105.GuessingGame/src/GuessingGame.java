import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        // write the guessing logic here
        int first = lowerLimit;
        int second = upperLimit;
        while (true) {
            if (second == first) {
                System.out.println("This number your thinking of is " + first + ".");
                break;
            } else if (isGreaterThan(average(first, second))) {
                first = average(first, second) + 1;
            } else {
                second = average(first, second);
            }
        }
    }

    // implement here the methods isGreaterThan and average
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        return reader.nextLine().equals("y");
    }

    public int average(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber)/2;
    }



    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
