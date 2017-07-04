import java.util.ArrayList;
import java.util.Collections;

public class JumpersList {
    private ArrayList<Jumper> jumpers;

    public JumpersList() {
        this.jumpers = new ArrayList<>();
    }

    public void add(Jumper jumper) {
        jumpers.add(jumper);
    }

    public void sort() {
        SortPointLowestFirst sortJumpers = new SortPointLowestFirst();
        Collections.sort(jumpers, sortJumpers);
    }

    public void reverse() {
        SortPointLowestFirst sortReverse = new SortPointLowestFirst();
        Collections.sort(jumpers, Collections.reverseOrder(sortReverse));
    }

    public void printJumpingOrder() {
        int order = 1;
        sort();
        for (Jumper jumper : jumpers) {
            System.out.println("  " + order + ". " + jumper);
            order++;
        }
    }

    public ArrayList<Jumper> allJumpers() {
        return jumpers;
    }

}
