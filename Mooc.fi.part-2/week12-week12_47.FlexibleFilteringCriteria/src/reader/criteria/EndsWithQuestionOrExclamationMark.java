

package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion {

    
    
    @Override
    public boolean complies(String line) {
        
        if(line.isEmpty()) {
            return false;
        }
        return line.charAt(line.length() -1) == '?' || 
               line.charAt(line.length() -1) == '!';
    }
}
