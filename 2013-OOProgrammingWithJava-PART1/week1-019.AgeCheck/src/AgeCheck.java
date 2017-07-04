
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        System.out.println("How old are you? ");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());
        if (0 <= age && age <= 120 ) {
            System.out.println("OK");
        }
        else {
            System.out.println("Impossible!");
        }

    }
}
