package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume = 0;

    public BulkTank() {
        this(2000);
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace() {
        return capacity - volume;
    }

    public void addToTank(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchFreeSpace()) {
            volume += amount;
        } else {
            volume = getCapacity();
        }
    }

    public double getFromTank(double amount) {
        if (amount > volume) {
            double all = volume;
            volume = 0.0;
            return all;
        }
        if (amount < 0) {
            return 0.0;
        }
        volume -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
