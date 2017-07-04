package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("src/shortList.txt");

        WordInspection countWords = new WordInspection(file);
        System.out.println(countWords.wordCount());
        System.out.println(countWords.wordsContainingZ());
        System.out.println(countWords.wordsEndingInL());
        System.out.println(countWords.palindromes());

    }
}
