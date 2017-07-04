import java.util.ArrayList;

/**
 * Created by Jeannette on 18/05/2017.
 */
public class Suitcase {
    private int maxWeight;
    private ArrayList<Thing> suitcaseContents;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcaseContents = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight) {
            suitcaseContents.add(thing);
        }
    }

    public String toString() {
        if (suitcaseContents.size() == 0) {
            return "empty (0 kg)";
        } else if (suitcaseContents.size() == 1) {
            return suitcaseContents.size() + " thing (" + totalWeight() + " kg)";
        }
        return suitcaseContents.size() + " things (" + totalWeight() + " kg)";
    }

    public void printThings() {
        for (Thing item : suitcaseContents) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing item : suitcaseContents) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        int heaviest = 0;
        for (Thing item : suitcaseContents) {
            if (item.getWeight() > heaviest) {
                heaviest = item.getWeight();
            }
        }
        for (Thing item : suitcaseContents) {
            if (item.getWeight() == heaviest) {
                return item;
            }
        }
        return null;
    }
}
