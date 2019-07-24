package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Integer> readings;
    private List<Sensor> sensorsList;

    public AverageSensor() {
        sensorsList = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
        
    }

    public void addSensor(Sensor additional) {
        this.sensorsList.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor s : sensorsList) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor s : sensorsList) {
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s : sensorsList) {
            s.off();
        }
    }

    @Override
    public int measure() {

        if (!isOn() || sensorsList.isEmpty()) {
            throw new IllegalStateException("Thermometers are not on or the sensors are missing.");
        } else {
            int total = 0;
            int average = 0;

            for (Sensor s : sensorsList) {
                total += s.measure();
            }
            average = total / sensorsList.size();
            readings.add(average);
            return average;
        }
       
    }

    public List<Integer> readings() {
       return this.readings;
    }
}
