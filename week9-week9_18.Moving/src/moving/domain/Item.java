
package moving.domain;

/**
 *
 * @author user
 */
public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;
    
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return getName() + " (" + getVolume() + " dm^3)" ;
    }

    @Override
    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    }
}
