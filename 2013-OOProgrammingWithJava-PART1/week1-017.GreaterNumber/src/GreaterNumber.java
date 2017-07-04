import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Type second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        int greaterNumber = Math.max(firstNumber, secondNumber);

        if (firstNumber != secondNumber) {
            System.out.println("Greater number: " + greaterNumber);
        } else {
            System.out.println("The numbers are equal!");
        }



    }
}
