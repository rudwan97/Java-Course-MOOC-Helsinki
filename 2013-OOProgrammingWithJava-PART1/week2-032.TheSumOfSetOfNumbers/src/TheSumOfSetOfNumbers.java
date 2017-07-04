
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int finalNumber = Integer.parseInt(reader.nextLine());
        int result = 0;
        int iterator = 0;

        while (iterator <= finalNumber) {
            result += iterator;
            iterator++;
        }
        System.out.println("Sum is " + result);

    }
}
