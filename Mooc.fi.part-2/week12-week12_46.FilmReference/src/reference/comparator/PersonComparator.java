package reference.comparator;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import reference.domain.Person;

public class PersonComparator implements Comparator<Person> {
    
    Map<Person, Integer> list;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        list  = peopleIdentities;
    }

    @Override
    public int compare(Person pers1, Person pers2) {
        if(list.get(pers1).equals((list.get(pers2)))) {
            return 0;
        } else if(list.get(pers1) > list.get(pers2)) {
            return -1;
        } else {
            return 1;
        }
    }
}
