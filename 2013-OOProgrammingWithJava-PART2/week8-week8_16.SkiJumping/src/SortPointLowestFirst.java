import java.util.Comparator;

public class SortPointLowestFirst implements Comparator<Jumper> {

    public int compare(Jumper jumper1, Jumper jumper2) {
        return jumper1.getPoints() - jumper2.getPoints();
    }
}
