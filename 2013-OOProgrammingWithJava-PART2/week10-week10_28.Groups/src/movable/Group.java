package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable{
    private List<Movable> movables;

    public Group() {
        this.movables = new ArrayList<>();
    }

    public void addToGroup(Movable movable) {
        movables.add(movable);
    }

    @Override
    public String toString() {
        String list = "";
        for (Movable movable : movables) {
            list += movable + "\n";
        }
        return list;
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
}
