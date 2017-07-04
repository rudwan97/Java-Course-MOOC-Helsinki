package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> translations;

    public PersonalMultipleEntryDictionary() {
        this.translations = new HashMap<>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.translations.containsKey(word)) {
            translations.put(word, new HashSet<>());
        }
        Set<String> translationsWord = this.translations.get(word);
        translationsWord.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (translations.containsKey(word)) {
            return translations.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        if (translations.containsKey(word)) {
            translations.remove(word);
        }
    }
}
