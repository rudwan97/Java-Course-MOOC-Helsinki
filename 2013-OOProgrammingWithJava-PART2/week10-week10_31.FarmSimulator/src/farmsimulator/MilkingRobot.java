package farmsimulator;

public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
        this.tank = null;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (tank == null) {
            throw new IllegalStateException("No tank attached");
        }
        tank.addToTank(milkable.milk());
    }
}
