
package reference.domain;

public enum Rating {
    
    BAD("-5"), // the constructor parameters are defined as constant values when they are read
    MEDIOCRE("-3"),
    NOT_WATCHED("0"),
    NEUTRAL("1"),
    FINE("3"),
    GOOD("5");

    private String name; // object variable

    private Rating(String name) { // constructor
        this.name = name;
    }

    public int getValue() {
        int temp = Integer.valueOf(name);
        return temp;
    }
}
