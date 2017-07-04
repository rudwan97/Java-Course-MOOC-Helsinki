package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> thingsInBox;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.thingsInBox = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        int currentWeight = 0;
        for (Thing item : thingsInBox) {
            currentWeight += item.getWeight();
        }
        if (thing.getWeight() + currentWeight <= maxWeight) {
            thingsInBox.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thingsInBox.contains(thing);
    }
}
