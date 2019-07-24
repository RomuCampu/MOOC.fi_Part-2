

public class CalculatorLogic {
    
    private int total;

    public void add(int num) {
        total += num;
    }

    public void decrease(int num) {
          total -= num;
    }
    
    public void reset() {
        total = 0;
    }
    
    public int result() {
        return total;
    }
}
