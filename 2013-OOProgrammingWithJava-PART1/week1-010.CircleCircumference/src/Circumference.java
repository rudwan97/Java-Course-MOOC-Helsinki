
import java.util.Map;
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = 1.0 * 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
