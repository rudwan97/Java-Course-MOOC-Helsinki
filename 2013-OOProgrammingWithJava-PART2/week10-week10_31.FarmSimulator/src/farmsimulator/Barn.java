package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobotStart;

    public Barn(BulkTank tank) {
        this.tank = tank;
        this.milkingRobotStart = new MilkingRobot();
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        milkingRobot.setBulkTank(tank);
        milkingRobotStart = milkingRobot;
    }

    public void takeCareOf(Cow cow) {
        milkingRobotStart.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        for (Cow cow :  cows) {
            takeCareOf(cow);
        }
    }

    @Override
    public String toString() {
        return tank.toString();
    }
}
