import java.util.ArrayList;

/**
 * Created by Jeannette on 16/05/2017.
 */
public class Birds {
    private ArrayList<String> birds;
    private ArrayList<String> observationList;
    private int observations;

    public Birds() {
        birds = new ArrayList<String>();
        observationList = new ArrayList<String>();
        observations = 0;
    }

    public void addBird(String name, String latinName) {
        String bird = name + " (" + latinName + ")";
        birds.add(bird);
    }

    public void observation(String name) {
        int exists = 0;
        for (String bird : birds) {
            if (bird.contains(name)) {
                observationList.add(bird);
                exists = 1;
            }
        }
        if (exists == 0) {
            System.out.println("Is not a bird!");
        }

    }

    public int observationTotal(String bird) {
        int total = 0;
        for (String name : observationList) {
            if (name.contains(bird)) {
                total++;
            }
        }
        return total;
    }

    public void statistics() {
        for (String bird : birds) {
            System.out.println(bird + ": " + observationTotal(bird) + " observations");
        }
    }

    public void show(String name) {
        for (String bird : birds) {
            if (bird.contains(name)) {
                System.out.println(bird + ": " + observationTotal(bird) + " observations");
            }
        }
    }
}
