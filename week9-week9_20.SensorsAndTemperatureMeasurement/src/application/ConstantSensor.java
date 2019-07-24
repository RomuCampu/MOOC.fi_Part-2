
package application;

/**
 *
 * @author user
 */
public class ConstantSensor implements Sensor{
    
    private int num;
    public ConstantSensor(int num) {
        this.num = num;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        
    }

    @Override
    public void off() {

    }

    @Override
    public int measure() {
        return this.num;
    }
    
}
