package dungeon;

import java.util.*;

public class Vampires {
    private Set<Coordinate> vampireCoordinates;
    private Coordinate coordinate;

    public Vampires() {
        this.vampireCoordinates = new HashSet<>();
        this.coordinate = new Coordinate(0,0);
    }

    public void startPositionVampires(int vampires, int length, int height) {
        int vampiresPositioned = vampires;
        Random vampirePosition = new Random();
        while (vampiresPositioned > 0) {
            int row = vampirePosition.nextInt(length);
            int column = vampirePosition.nextInt(height);
            if (!vampireCoordinates.contains(coordinate)) {
                vampireCoordinates.add(new Coordinate(row, column));
                vampiresPositioned--;
            }
        }
        vampireCoordinates.remove(coordinate);
    }

    public Set<Coordinate> getVampireCoordinates() {
        return vampireCoordinates;
    }

    public boolean vampireCoordinateExists(int row, int column) {
        for (Coordinate coordinate : vampireCoordinates) {
            if (coordinate.getRow() == row && coordinate.getColumn() == column) {
                return true;
            }
        }
        return false;
    }

    public void removeCoordinates(Set<Coordinate> toBeRemoved) {
        vampireCoordinates.removeAll(toBeRemoved);
    }

    public boolean containsCoordinate (Coordinate contained) {
        for (Coordinate coordinate : vampireCoordinates) {
            if (coordinate.equals(contained)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String coordinates = "";
        for (Coordinate coordinate : vampireCoordinates) {
            coordinates += ("v " + coordinate + "\n");
        }
        return coordinates;
    }
}
