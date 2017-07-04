package dungeon;

public class Player {
    private Coordinate coordinates;

    public Player() {
        this.coordinates = new Coordinate(0,0);
    }

    public void setCoordinates(int row, int column) {
        coordinates.setRow(row);
        coordinates.setColumn(column);
    }

    public Coordinate getCoordinates() {
        return coordinates;
    }

    public int getRow() {
        return coordinates.getRow();
    }

    public int getColumn() {
        return coordinates.getColumn();
    }



    @Override
    public String toString() {
        return "@ " + coordinates;
    }
}
