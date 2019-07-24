
import java.util.List;

public class Person {

    private String personName;
    private List<String> personAddress;
    private List<String> personNumber;

    public Person(String personName) {
        this.personName = personName;
    }
    
    public Person() {
        
    }

    public void addAddress(List<String> address) {
        this.personAddress = address;
    }

    public void addNumber(List<String> number) {
        this.personNumber = number;
    }

    public String getName() {
        return this.personName;
    }

    public List<String> getAddress() {
        return this.personAddress;
    }

    public List<String> getNumber() {
        return this.personNumber;
    }
}
