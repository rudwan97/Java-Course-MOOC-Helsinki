import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jumper {
    private String name;
    private Random random;
    private int totalPoints;
    private ArrayList<Integer> jumpLengths;


    public Jumper(String name) {
        this.name = name;
        this.random = new Random();
        this.totalPoints = 0;
        this.jumpLengths = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.totalPoints;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }

    public int jumpLength() {
        int length = random.nextInt(120-60) + 60;
        jumpLengths.add(length);
        totalPoints += length;
        return length;

    }

    public ArrayList<Integer> judgesScores() {
        ArrayList<Integer> points = new ArrayList<>();
        int i = 0;
        while (i < 5) {
            points.add(random.nextInt(20-10)+10);
            i++;
        }
        Collections.sort(points);
        totalPoints = totalPoints + points.get(1) + points.get(2) + points.get(3);
        return points;
    }

    public void printElegantly() {
        for (int i = 0; i < jumpLengths.size(); i++) {
            System.out.print(jumpLengths.get(i) + " m");
            if (i < (jumpLengths.size() - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return name + " (" + totalPoints + " points)";
    }
}
