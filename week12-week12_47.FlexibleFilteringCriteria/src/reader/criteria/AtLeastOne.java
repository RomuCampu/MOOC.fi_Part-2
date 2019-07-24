

package reader.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class AtLeastOne implements Criterion {

    private List<Criterion> criteria;
    
    public AtLeastOne(Criterion... criteria) {
        this.criteria = new ArrayList<Criterion>();
        this.criteria.addAll(Arrays.asList(criteria));
    }

    @Override
    public boolean complies(String line) {
        
        for(Criterion c : criteria) {
            if(c.complies(line)) {
                return true;
            }
        }
        return false;
    }
}
