package farmsimulator;

import java.util.LinkedList;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private LinkedList<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new LinkedList<>();
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    public String getOwner() {
        return owner;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public String cowsInBarn() {
        if (cows.size() == 0) {
            return "No cows";
        }
        StringBuilder sb = new StringBuilder();
        for (Cow cow : cows) {
            sb.append(cow.toString()).append("\n        ");
        }
        return "Animals: " + "\n        " + sb;
    }

    public void manageCows() {
        barn.takeCareOf(cows);
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    @Override
    public String toString() {
        return "Farm owner: " + owner + "\nBarn bulk tank: " + barn.toString() + "\n" + cowsInBarn();
    }
}
