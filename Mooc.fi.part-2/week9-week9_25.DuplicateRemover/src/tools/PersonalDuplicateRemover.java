
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PersonalDuplicateRemover implements DuplicateRemover {

    private List<String> listOfDuplicates;
    private Set<String> listOfNonDuplicates;
    
    public PersonalDuplicateRemover() {
        listOfDuplicates = new ArrayList<String>();
        listOfNonDuplicates = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        if(!listOfNonDuplicates.contains(characterString)) {
            listOfNonDuplicates.add(characterString);
        } else if (listOfNonDuplicates.contains(characterString)
                || listOfDuplicates.contains(characterString)){
            listOfDuplicates.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return listOfDuplicates.size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        
        Set<String> set = new HashSet<String>();
        
        for(String s : listOfNonDuplicates) {
            set.add(s);
        }
        return set;
    }

    @Override
    public void empty() {
        listOfNonDuplicates.removeAll(listOfNonDuplicates);
        listOfDuplicates.removeAll(listOfDuplicates);
    }
}
