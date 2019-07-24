package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employeesList;
    

    public Employees() {
        employeesList = new ArrayList<Person>();
    }

    public void add(Person person) {
        if (!employeesList.contains(person)) {
            employeesList.add(person);
        }
    }

    public void add(List<Person> persons) {
        for (Person next : persons) {
            employeesList.add(next);
        }
    }

    public void print() {
        Iterator<Person> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {

        Iterator<Person> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            Person p = (Person) iterator.next();
            if (p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        
        Iterator<Person> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation().equals(education)) {
                iterator.remove();
            }
        }
        
    }
}
