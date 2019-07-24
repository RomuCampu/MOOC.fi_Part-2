package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return getCapacity() - getVolume();
    }

    public void addToTank(double amount) {
        
        if(volume + amount <= capacity) {
            this.volume += amount;
        } else {
            this.volume = this.capacity;
        }

    }

    public double getFromTank(double amount) {
        
        if(amount <= volume) {
            volume -= amount;
            return volume;
        } else {
            volume = 0;
            return volume;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}
