import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jeannette on 19/05/2017.
 */
public class Airplanes {
    private HashMap<String, Integer> airplanes;
    private ArrayList<String> flights;

    public Airplanes() {
        this.airplanes = new HashMap<String, Integer>();
        this.flights = new ArrayList<String>();
    }

    public void addPlane(String planeId, int capacity) {
        this.airplanes.put(planeId, capacity);
    }

    public void addFlight(String planeId, String route) {
        for (String plane : planes())
            if (plane.contains(planeId)) {
                this.flights.add(plane + " (" + route + ")");
            }
    }

    public ArrayList<String> planes() {
        ArrayList<String> planeList = new ArrayList<String>();
        for (String key : this.airplanes.keySet()) {
            String plane = key + " (" + this.airplanes.get(key) + " ppl)";
            planeList.add(plane);
        }
        return planeList;
    }

    public void printPlanes() {
        for (String plane : planes()) {
            System.out.println(plane);
        }
        System.out.println();
    }

    public void printFlights() {
        for (String flight : this.flights) {
            System.out.println(flight);
        }
        System.out.println();
    }

    public void printPlaneInfo(String id) {
        for (String plane : planes()) {
            if (plane.contains(id)) {
                System.out.println(plane);
            }
        }
        System.out.println();
    }
}
