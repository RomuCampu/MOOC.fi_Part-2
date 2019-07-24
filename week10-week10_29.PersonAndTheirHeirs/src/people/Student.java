
package people;

public class Student extends Person {
    
    private int credits;
    
    public Student(String name, String address) {
        super(name, address);
    }
    
    public int credits() {
        return this.credits;
    }
    
    public void study() {
        credits++;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  credits " + this.credits();
    }
    
}
