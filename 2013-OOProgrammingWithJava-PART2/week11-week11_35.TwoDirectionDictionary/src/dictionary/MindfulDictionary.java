package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class MindfulDictionary {
    private File file;
    private Map<String, String> dictionary;


    public MindfulDictionary() {
        this.dictionary = new HashMap<>();
    }

    public MindfulDictionary(String file) {
        this.file = new File(file);
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.containsValue(translation) && !dictionary.containsKey(word))
        dictionary.put(word, translation);;
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        for (String finnishWord : dictionary.keySet()) {
            if (dictionary.get(finnishWord).equals(word)) {
                return finnishWord;
            }
        }
        return null;
    }

    public void remove(String word) {
        String key = "";
        String value = "";
        for (String finnishWord : dictionary.keySet()) {
            if (dictionary.get(finnishWord).equals(word)) {
                key += finnishWord;
                value += word;
            } else if (finnishWord.equals(word)) {
                key += word;
                value += dictionary.get(word);
            }
        }
        dictionary.remove(key, value);
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(file);
            while ( fileReader.hasNextLine() ) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (String finnishWord : dictionary.keySet()) {
                fileWriter.write(finnishWord + ":" + dictionary.get(finnishWord));
                fileWriter.write("\n");
            }
            fileWriter.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

}
