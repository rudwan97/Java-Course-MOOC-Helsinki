package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion {
    private List<Criterion> allCriteria;

    public AtLeastOne(Criterion... criteria) {
        this.allCriteria = new ArrayList<>();
        for (int i = 0; i < criteria.length; i++) {
            allCriteria.add(criteria[i]);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion : allCriteria) {
            if (criterion.complies(line)) {
                return true;
            }
        }
        return false;
    }
}
