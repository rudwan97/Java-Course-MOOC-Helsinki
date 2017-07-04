package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        for (Thing thing: things) {
            Box box = new Box(boxesVolume);
            box.addThing(thing);
            boxes.add(box);
            }
        return boxes;
    }
}
