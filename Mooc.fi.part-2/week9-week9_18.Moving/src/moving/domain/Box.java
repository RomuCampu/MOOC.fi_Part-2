
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Box implements Thing {
    
    private int maximumCapacity;
    private List<Thing> boxOfThings;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        boxOfThings = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        
        if(maximumCapacity >= thing.getVolume()) {
            maximumCapacity -= thing.getVolume();
            boxOfThings.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int totalVolume = 0;
        
        for(Thing t : boxOfThings) {
            totalVolume += t.getVolume();
        }
        return totalVolume;
    }
    
    @Override
    public String toString() {
        for(Thing t : boxOfThings) {
            return t + " : " + t.getVolume();
        }
        return "";
    }
}
