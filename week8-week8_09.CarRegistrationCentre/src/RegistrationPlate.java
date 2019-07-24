
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        
        if (getClass() != object.getClass()) {
            return false;
        }
        
        RegistrationPlate compare = (RegistrationPlate) object;
        
        if (!this.country.equals(compare.country)) {
            return false;
        }
        
        if (!this.regCode.equals(compare.regCode)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if(regCode == null) {
            return 7;
        }
        
        if(country == null) {
            return 7;
        }
        return this.regCode.hashCode() + this.country.hashCode();
    }

}
