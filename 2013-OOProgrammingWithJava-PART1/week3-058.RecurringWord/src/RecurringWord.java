
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String repeated = "";
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (words.contains(word)) {
                repeated += word;
                break;
            }
            words.add(word);
        }
        System.out.println("You gave the word " + repeated + " twice");
    }
}
