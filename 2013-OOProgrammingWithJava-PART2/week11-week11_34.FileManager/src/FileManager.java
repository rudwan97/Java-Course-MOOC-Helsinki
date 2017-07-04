
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> fileLines = new ArrayList<>();
        Scanner reader = new Scanner(new File(file));

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            fileLines.add(line);
        }
        reader.close();
        return fileLines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        for (String text : texts) {
            writer.write(text + "\n");
        }
        writer.close();
    }
}
