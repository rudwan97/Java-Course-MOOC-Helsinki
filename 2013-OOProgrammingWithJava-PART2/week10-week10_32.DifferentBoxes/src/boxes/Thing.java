package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }

        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {

        this(name, 0);
    }

    public String getName() {

        return name;
    }

    public int getWeight() {

        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        return getName() != null ? getName().equals(thing.getName()) : thing.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
