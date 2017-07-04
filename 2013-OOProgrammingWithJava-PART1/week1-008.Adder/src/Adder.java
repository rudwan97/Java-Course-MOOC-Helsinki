
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type a another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int result = firstNumber + secondNumber;
        String sumOfNumbers = "Sum of the numbers: " + result;
        System.out.print(sumOfNumbers);

        
    }
}
