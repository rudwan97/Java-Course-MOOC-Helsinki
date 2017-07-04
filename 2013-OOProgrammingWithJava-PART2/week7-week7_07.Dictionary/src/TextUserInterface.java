import java.util.Scanner;

/**
 * Created by Jeannette on 19/05/2017.
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            if (input.isEmpty()) {
                System.out.println("  add - adds a word pair to the dictionary");
                System.out.println("  translate - asks a word and prints its translation");
                System.out.println("  quit - quit the text user interface\n");
            }
            if (input.equals("add")) {
                System.out.print("In Finnish: ");
                String finnishWord = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                dictionary.add(finnishWord, translation);
                System.out.println();
            }
            if (input.equals("translate")) {
                System.out.print("Give a word: ");
                String givenWord = reader.nextLine();
                String translation = dictionary.translate(givenWord);
                System.out.print("Translation: " + translation);
                System.out.println();
            }
        }
    }
}
