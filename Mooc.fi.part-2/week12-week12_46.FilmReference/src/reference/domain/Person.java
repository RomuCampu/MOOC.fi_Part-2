

package reference.domain;

/**
 *
 * @author user
 */
public class Person {

    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Person name = " + name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
    
        int compare = this.name.compareToIgnoreCase(other.name);

        if (compare < 0) {
            return false;
        } else return compare == 0;
    }
    
    
}
