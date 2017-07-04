import java.util.Comparator;

/**
 * Created by Jeannette on 28/05/2017.
 */
public class SortAgainstSuitAndValue implements Comparator<Card> {

    public int compare(Card card1, Card card2) {
        if(card1.getSuit() == card2.getSuit()) {
            if (card1.getValue() > card2.getValue()) {
                return 1;
            } else if (card1.getValue() == card2.getValue()) {
                return 0;
            } else {
                return -1;
            }
        } else if (card1.getSuit() > card2.getSuit()) {
            return 1;
        } else {
            return -1;
        }
    }
}
