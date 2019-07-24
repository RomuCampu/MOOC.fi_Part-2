package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if(name == null) throw new IllegalArgumentException("");
        else if(name.length() > 40) throw new IllegalArgumentException();
        else if(name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
        
        if(age < 0 || age > 120) throw new IllegalArgumentException("");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
