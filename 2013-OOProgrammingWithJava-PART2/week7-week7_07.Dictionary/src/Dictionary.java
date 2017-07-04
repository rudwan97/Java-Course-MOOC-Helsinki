import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jeannette on 19/05/2017.
 */
public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> allWords = new ArrayList<String>();
        for (String key: this.dictionary.keySet()) {
            allWords.add(key + " = " + dictionary.get(key));
        }
        return allWords;
    }
}
