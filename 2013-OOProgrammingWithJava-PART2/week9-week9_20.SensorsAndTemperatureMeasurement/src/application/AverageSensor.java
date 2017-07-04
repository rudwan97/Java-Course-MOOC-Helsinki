package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> measures = new ArrayList<>();

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return measures;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException("The sensor is not on");
        }
        if (sensors.isEmpty()) {
            throw new IllegalStateException("No sensors in list");
        }
        int measuresSum = 0;
        for (Sensor sensor : sensors) {
            measuresSum += sensor.measure();
        }
        this.measures.add(measuresSum/sensors.size());
        return measuresSum/sensors.size();
    }
}
