import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightLimit;
    
    public Suitcase(int weightLimilt) {
        this.weightLimit = weightLimilt;
    }
    
    public void addThing(Thing thing) {
        things.add(thing);
        weightLimit -= thing.getWeight();
        if(weightLimit < 0) {
            things.remove(thing);
            weightLimit += thing.getWeight();
        }
    }
    
    public void printThings() {
        for(Thing t : things) {
            System.out.println(t);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Thing t : things) {
            weight += t.getWeight();
        }
        return weight;
    }
    
    public Thing heaviestThing() {
        Thing thing = things.get(0);
        int getWeight = things.get(0).getWeight();
        for(Thing t : things) {
            if(t.getWeight() > getWeight) {
                getWeight = t.getWeight();
                thing = t;
            }
        }
        return thing;
    }
    
    @Override
    public String toString() {
        int weight = 0;
        for(Thing t : things) {
            weight += t.getWeight();
        }
        if (things.isEmpty()) {
            return "empty (" + weight + ")kg";
        } else if (things.size() <= 1) {
            return things.size() + " thing (" + weight + ")kg";
        } else {
            return things.size() + " things (" + weight + ")kg";
        }
    }
}
