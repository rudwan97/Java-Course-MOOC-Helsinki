
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if (50 <= points) {
            System.out.println("Grade: 5");
        }
        else if (45 <= points) {
            System.out.println("Grade: 4");
        }
        else if (40 <= points) {
            System.out.println("Grade: 3");
        }
        else if (35 <= points) {
            System.out.println("Grade: 2");
        }
        else if (30 <= points) {
            System.out.println("Grade: 1");
        }
        else if (0 <= points) {
            System.out.println("Grade: failed");
        }

    }
}
