import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird, List<String>> observedBirds = new HashMap<>();

    public void observe(Bird bird, String place) {
        if (observedBirds.containsKey(bird)) {
            observedBirds.get(bird).add(place);
        } else {
            observedBirds.put(bird, new ArrayList<>());
            observedBirds.get(bird).add(place);
        }
    }

    public void observations(Bird bird) {
        if (!observedBirds.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
            return;
        }

        System.out.println(bird + " observations: " + observedBirds.get(bird).size());
        for (String location : observedBirds.get(bird)) {
            System.out.println(location);
        }
    }
}
