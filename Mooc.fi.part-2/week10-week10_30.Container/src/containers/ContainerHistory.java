package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double greatestFluctuation() {

       List<Double> fluctuations = new ArrayList<Double>();
        double greatestFluctuation = 0;
        if(history.isEmpty() || history.size() == 1){
            return greatestFluctuation;
        }else{
            for(int i = history.size() - 1; i >= 1; i--){
                double fluctuation = Math.abs(history.get(i) - history.get(i-1));
                fluctuations.add(fluctuation);
            }
        }
        for(double f : fluctuations){
            if(greatestFluctuation < f){
                greatestFluctuation = f;
            }
        }
        return greatestFluctuation;
    }

    public double variance() {
        double total = 0;

        for (double d : history) {
            total += Math.pow((d - average()), 2);
        }

        return total / (history.size() - 1);
    }

    public double maxValue() {
        return Collections.max(history);
    }

    public double minValue() {
        return Collections.min(history);
    }

    public double average() {

        double total = 0;

        for (Double d : history) {
            total += d;
        }

        return total / history.size();
    }
}
