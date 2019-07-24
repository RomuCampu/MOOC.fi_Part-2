
package containers;

public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory containerHistory;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        //this.initialVolume = initialVolume;
        containerHistory = new ContainerHistory();
        containerHistory.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return containerHistory.toString();
    }
    
    @Override
    public void addToTheContainer(double amount) {
        
        if(amount <= 0) {
            return;
        }
        super.addToTheContainer(amount);
        containerHistory.add(getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        
        if(amount < 0) {
            return 0.0;
        }
        
        double initialAmount = getVolume();
        super.takeFromTheContainer(amount);
        containerHistory.add(getVolume());
        
        return initialAmount - getVolume();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + getName() 
                         + "\nHistory: "  + history()
                         + "\nGreatest product amount: " + containerHistory.maxValue()
                         + "\nSmallest product amount: " + containerHistory.minValue()
                         + "\nAverage: " + containerHistory.average()
                         + "\nGreatest change: " + containerHistory.greatestFluctuation()
                         + "\nVariance: " + containerHistory.variance());
    }
}
