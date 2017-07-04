package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {
    private String name;
    private double capicity;
    private double milkInUdders;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.capicity = 15 + new Random().nextInt(26);
        int nameIndex = new Random().nextInt(NAMES.length);
        this.name = (NAMES[nameIndex]);
        this.milkInUdders = 0.0;
    }

    public Cow(String name) {
        this.name = name;
        this.capicity = 15 + new Random().nextInt(26);
        this.milkInUdders = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return capicity;
    }

    public double getAmount() {
        return milkInUdders;
    }

    @Override
    public void liveHour() {
        double amountGained = 0.7 + new Random().nextDouble()*1.3;
        if (amountGained + milkInUdders > capicity) {
            milkInUdders = capicity;
        } else {
            milkInUdders += amountGained;
        }
    }

    @Override
    public double milk() {
        double beforeMilking = milkInUdders;
        milkInUdders = 0;
        return beforeMilking;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(milkInUdders) + "/" + Math.ceil(capicity);
    }
}
