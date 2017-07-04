import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int result = 1;
        int iterator = 1;

        while (iterator <= factorial) {
            result *= iterator;
            iterator++;
        }
        System.out.println("Factorial is " + result);

    }
}
