
import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> box = new ArrayList<ToBeStored>();
   // private ToBeStored tbs;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public void add(ToBeStored tbs) {
        if (weight() + this.weight() <= this.maxWeight) {
            this.box.add(tbs);
        }
        //box.add(tbs);
    }

    public double weight() {
        double weight = 0;
        for(ToBeStored t : box) {
           weight += t.weight();
        }
        return weight;
    }
    @Override
    public String toString() {
        return "Box: " + box.size() + " things, total weight " + weight() + " kg";
    }
}
