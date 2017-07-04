package reader.criteria;

public class Both implements Criterion {
    private Criterion first;
    private Criterion second;

    public Both(Criterion first, Criterion second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean complies(String line) {
        if (first.complies(line) && second.complies(line)) {
            return true;
        }
        return false;
    }
}
