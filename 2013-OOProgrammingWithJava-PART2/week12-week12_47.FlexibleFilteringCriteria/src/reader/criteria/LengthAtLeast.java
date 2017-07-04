package reader.criteria;

public class LengthAtLeast implements Criterion {
    private int value;

    public LengthAtLeast(int value) {
        this.value = value;
    }

    @Override
    public boolean complies(String line) {
        return line.length() >= value;
    }
}
