
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        System.out.println("Last: ");
        int startNumber = Integer.parseInt(reader.nextLine());
        int finalNumber = Integer.parseInt(reader.nextLine());
        int result = 0;

        while (startNumber <= finalNumber) {
            result += startNumber;
            startNumber++;
        }
        System.out.println("The sum is " + result);
        
    }
}
