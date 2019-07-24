import java.util.ArrayList;

public class Container {
    private int weightLimit;
    ArrayList<Suitcase> container = new ArrayList<Suitcase>();
    
    public Container(int weightLimit) {
        this.weightLimit = weightLimit;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        container.add(suitcase);
        weightLimit -= suitcase.totalWeight();
        
        if(weightLimit < 0) {
            container.remove(suitcase);
            weightLimit += suitcase.totalWeight();
        }
    }
    
    public void printThings() {
        for(Suitcase s : container) {
            s.printThings();
        }
    }
    
    public String toString() {
        int weight = 0;
        for(Suitcase s : container) {
            weight += s.totalWeight();
        }
        return container.size() + " suitcases (" + weight + ")";
    }
}
