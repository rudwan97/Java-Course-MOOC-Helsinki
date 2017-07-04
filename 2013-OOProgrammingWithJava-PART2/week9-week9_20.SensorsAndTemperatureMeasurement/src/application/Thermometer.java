package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean startOn = false;


    @Override
    public boolean isOn() {
        if (startOn) {
            return true;
        }
        return false;
    }

    @Override
    public void on() {
        startOn = true;
    }

    @Override
    public void off() {
        startOn = false;
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException("Thermometer is not on");
        }
        Random random = new Random();
        int measure = -30 + random.nextInt(61);
        return measure;
    }
}
