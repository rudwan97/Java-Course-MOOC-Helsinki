package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    public EndsWithQuestionOrExclamationMark() {

    }

    @Override
    public boolean complies(String line) {
        if (line.endsWith("?") || line.endsWith("!")) {
            return true;
        }
        return false;
    }
}
