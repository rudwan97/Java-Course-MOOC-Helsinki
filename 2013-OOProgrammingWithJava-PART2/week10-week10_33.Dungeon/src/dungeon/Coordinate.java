package dungeon;

public class Coordinate {
    private int row;
    private int column;

    public Coordinate(int column, int row) {
        this.row = row;
        this.column = column;
    }

    public void setRow(int newRow) {
        this.row = newRow;
    }

    public void setColumn(int newColumn) {
        this.column = newColumn;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinate that = (Coordinate) o;

        if (row != that.row) return false;
        return column == that.column;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + column;
        return result;
    }

    @Override
    public String toString() {
        return column + " " + row;
    }
}
