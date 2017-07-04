import java.util.ArrayList;

/**
 * Created by Jeannette on 18/05/2017.
 */
public class Container {
    private int maxWeightLimit;
    private ArrayList<Suitcase> containerContents;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        this.containerContents = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (getTotalWeight() + suitcase.totalWeight() <= maxWeightLimit) {
            containerContents.add(suitcase);
        }
    }

    public String toString() {
        if (containerContents.size() == 0) {
            return "empty (0 kg)";
        }
        return containerContents.size() + " suitcases (" + getTotalWeight() + " kg)";
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : containerContents) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }

    public void printThings() {
        for (Suitcase suitcase : containerContents) {
            suitcase.printThings();
            }
    }
}
