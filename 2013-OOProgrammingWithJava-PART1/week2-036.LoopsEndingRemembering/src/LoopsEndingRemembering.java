import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.println("Type numbers: ");
        int result = 0;
        int amountNumbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            result += number;
            amountNumbers++;
        }

        double average = (1.0 * result)/(1.0 * amountNumbers);

        System.out.println("The sum is " + result);
        System.out.println("How many numbers: " + amountNumbers);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

    }
}
