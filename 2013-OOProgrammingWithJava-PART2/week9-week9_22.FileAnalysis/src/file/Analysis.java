package file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Analysis {
    private File file;
    private List<String> linesInFile;

    public Analysis(File file) throws Exception {
        this.file = file;
        linesInFile = new ArrayList<>();
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            linesInFile.add(reader.nextLine());
        }

    }

    public int lines() {
        return linesInFile.size();
    }

    public int characters() {
        int totalCharacters = lines();
        for (String line : linesInFile) {
            totalCharacters += line.length();
        }
        return totalCharacters;
    }
}
