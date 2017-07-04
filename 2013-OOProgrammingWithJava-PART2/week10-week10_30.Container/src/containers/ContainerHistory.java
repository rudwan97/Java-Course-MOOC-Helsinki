package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private List<Double> situationList;

    public ContainerHistory() {
        situationList = new ArrayList<>();
    }

    public void add(double situation) {
        situationList.add(situation);
    }

    public void reset() {
        situationList.clear();
    }

    public double maxValue() {
        return Collections.max(situationList);
    }

    public double minValue() {
        return Collections.min(situationList);
    }

    public double average() {
        if (situationList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double situation : situationList) {
            sum += situation;
        }
        return sum/situationList.size();
    }

    public double greatestFluctuation() {
        if (situationList.size() < 2) {
            return 0;
        }
        double greatest = 0;
        for ( int i=0; i < situationList.size()-1; i++ ) {
            double difference = Math.abs(situationList.get(i)-situationList.get(i+1));
            if (difference > greatest) {
                greatest = difference;
            }
        }
        return greatest;
    }

    public double variance() {
        if (situationList.size() < 2) {
            return 0;
        }
        double varianceNumerator = 0;
        for (Double situation : situationList) {
            varianceNumerator += Math.pow((situation - average()), 2);
        }
        return varianceNumerator/(situationList.size()-1);
    }

    @Override
    public String toString() {
        return situationList.toString();
    }
}
