package tools;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jeannette on 05/06/2017.
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> strings = new HashSet<>();
    private int duplicates = 0;

    @Override
    public void add(String characterString) {
        if (strings.contains(characterString)) {
            duplicates++;
        }
        strings.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return strings;
    }

    @Override
    public void empty() {
        strings.clear();
        duplicates = 0;
    }
}
