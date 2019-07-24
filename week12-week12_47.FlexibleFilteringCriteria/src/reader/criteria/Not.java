

package reader.criteria;


public class Not implements Criterion {
    
    private Criterion condition;
    
    public Not(Criterion condition) {
        this.condition = condition;
    }

    @Override
    public boolean complies(String line) {
        
        return !condition.complies(line);
    }

}
