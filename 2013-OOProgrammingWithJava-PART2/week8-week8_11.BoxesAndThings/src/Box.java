import java.util.ArrayList;

/**
 * Created by Jeannette on 24/05/2017.
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> items;


    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(ToBeStored toBeStored) {
        if (toBeStored.weight() + weight() <= maxWeight) {
            items.add(toBeStored);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
