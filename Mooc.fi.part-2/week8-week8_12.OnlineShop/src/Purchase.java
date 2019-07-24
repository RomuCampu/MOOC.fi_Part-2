
public class Purchase {
    
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
    public String name() {
        return this.product;
    }
    
    public int price() {
        return unitPrice * amount;
    }
    
    public void increaseAmount() {
        amount++;
    }
    
    public String toString() { 
        return product + ": " + amount;
    }
}
