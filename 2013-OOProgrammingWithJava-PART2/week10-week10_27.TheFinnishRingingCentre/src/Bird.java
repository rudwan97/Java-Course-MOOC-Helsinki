
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (ringingYear != bird.ringingYear) return false;
        return latinName != null ? latinName.equals(bird.latinName) : bird.latinName == null;
    }

    @Override
    public int hashCode() {
        int result = latinName != null ? latinName.hashCode() : 0;
        result = 31 * result + ringingYear;
        return result;
    }
}


