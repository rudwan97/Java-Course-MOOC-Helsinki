import java.util.ArrayList;

/**
 * Created by Jeannette on 17/05/2017.
 */
public class Changer {
    private ArrayList<Change> changeList;
    private String word;

    public Changer() {
        this.changeList = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changeList.add(change);
    }

    public String change(String characterString) {
        this.word = characterString;
        for (Change change : changeList) {
            word = change.change(word);
        }
        System.out.println(word);
        return word;
    }
}
