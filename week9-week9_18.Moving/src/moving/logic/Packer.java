package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author user
 */
public class Packer {
    
    private int boxesVolume;
    private List<Box> listOfThings;
    
    public Packer(int boxesVolume)  {
        this.boxesVolume = boxesVolume;
        this.listOfThings = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things) {
        
        for(Thing t: things) {
           Box box = new Box(boxesVolume);
           box.addThing(t);
           listOfThings.add(box);
        }
        return this.listOfThings;
    }
}
