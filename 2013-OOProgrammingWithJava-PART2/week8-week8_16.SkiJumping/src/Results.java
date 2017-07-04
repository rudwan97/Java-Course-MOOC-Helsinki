import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Results {
    private Random random;
    private Jumper jumper;
    private ArrayList<Integer> jumpLengths;

    public Results(Jumper jumper) {
        this.random = new Random();
        this.jumper = jumper;
        this.jumpLengths = new ArrayList<>();
    }

    public int jumpLength() {
        int length = random.nextInt(120-60) + 60;
        jumpLengths.add(length);
        jumper.addPoints(length);
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
        jumper.addPoints(points.get(1) + points.get(2) + points.get(3));
        return points;
    }

    public void printLengthsElegantly() {
        for (int i = 0; i < jumpLengths.size(); i++) {
            System.out.print(jumpLengths.get(i) + " m");
            if (i < (jumpLengths.size() - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printFinalResults(JumpersList jumpers) {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int position = 1;
        jumpers.reverse();
        for (Jumper jumper : jumpers.allJumpers()) {
            System.out.println(position + "           " + jumper);
            System.out.print("            jump lengths: ");
            printLengthsElegantly();
            position++;
        }
    }
}
