package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> boxItems;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.boxItems = new ArrayList<>();
    }

    public boolean addThing(Thing thing) {
        if (getVolumeContainedInBox() + thing.getVolume() <= this.maximumCapacity) {
            boxItems.add(thing);
            return true;
        }
        return false;
    }

    private int getVolumeContainedInBox() {
        int sum = 0;
        for (Thing thing : boxItems) {
            sum += thing.getVolume();
        }
        return sum;
    }

    @Override
    public int getVolume() {
        return getVolumeContainedInBox();
    }
}
