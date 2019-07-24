
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public int hashCode() {
        return ringingYear * ringingYear;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj == null) {
            return false;
        }
        
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        
        final Bird otherBird = (Bird) obj;
        
        return this.latinName.equals(otherBird.latinName) && this.ringingYear == otherBird.ringingYear; 
        
    }
}


