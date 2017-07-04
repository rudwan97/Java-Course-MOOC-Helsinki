/**
 * Created by Jeannette on 23/05/2017.
 */
public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }
}
