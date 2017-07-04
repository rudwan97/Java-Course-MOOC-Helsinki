package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() {
        return readFile().size();
    }

    public List<String> wordsContainingZ() {
        List<String> words = readFile();
        List<String> zWords = new ArrayList<>();

        for (String word : words) {
            if (word.contains("z")) {
                zWords.add(word);
            }
        }
        return zWords;
    }

    public List<String> wordsEndingInL() {
        List<String> words = readFile();
        List<String> wordsL = new ArrayList<>();

        for (String word : words) {
            if (word.endsWith("l")) {
                wordsL.add(word);
            }
        }
        return wordsL;
    }

    public List<String> palindromes() {
        List<String> words = readFile();
        List<String> wordsPalindromes = new ArrayList<>();

        for (String word : words) {
            String reversed = "";
            int i = 0;
            while (i < word.length()) {
                char c = word.charAt(i);
                reversed = c + reversed;
                i++;
            }
            if (word.equals(reversed)) {
                wordsPalindromes.add(word);
            }
        }
        return wordsPalindromes;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> words = readFile();
        List<String> wordsContainingAllVowels = new ArrayList<>();
        for (String word : words) {
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o")
                    && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")) {
                wordsContainingAllVowels.add(word);
            }
        }
        return wordsContainingAllVowels;
    }

    private List<String> readFile() {
        try {

            List<String> wordsInFile = new ArrayList<>();

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                wordsInFile.add(reader.nextLine());
            }

            return wordsInFile;
        } catch (FileNotFoundException ex) {
            return (List<String>) ex;
        }
    }
}
