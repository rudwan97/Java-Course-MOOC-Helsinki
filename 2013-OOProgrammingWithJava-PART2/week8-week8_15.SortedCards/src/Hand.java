import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jeannette on 28/05/2017.
 */
public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int sumOfCards() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand hand) {
        if (sumOfCards() > hand.sumOfCards()) {
            return 1;
        } else if (sumOfCards() == hand.sumOfCards()) {
            return 0;
        } else {
            return -1;
        }
    }

    public void sortAgainstSuit() {
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
