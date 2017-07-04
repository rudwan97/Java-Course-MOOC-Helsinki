import java.util.Scanner;

/**
 * Created by Jeannette on 18/05/2017.
 */
public class Reader {
    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString() {
        return reader.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(reader.nextLine());
    }
}
