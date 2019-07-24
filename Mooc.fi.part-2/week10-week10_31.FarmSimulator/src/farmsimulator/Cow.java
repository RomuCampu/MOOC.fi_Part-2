
package farmsimulator;

import java.util.Random;


public class Cow implements Milkable, Alive{
    
    private String name;
    
    public Cow() {
        name = "random";
    }
    
    public Cow(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        double capacity = 15 + new Random().nextInt(26);
        return capacity;
    }
    
    public double getAmount() {
        return getCapacity();
    }

    @Override
    public String toString() {
        return "";
    }
    
    @Override
    public double milk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void liveHour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
