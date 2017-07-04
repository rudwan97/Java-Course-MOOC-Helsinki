
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int iterator = 0;
        int result = 0;

        while (iterator <= number) {
            result += (int)Math.pow(2, iterator);
            iterator++;
        }
        System.out.println("The result is " + result);

    }
}
