
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        // call your method from here
        System.out.println("Number of characters: " + calculateCharacters(reader.nextLine()));
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        return text.length();

    }
    
}
