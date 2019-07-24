
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private String userName;
    private List<String> userNumber;
    private List<Person> personList;
    private Map<String, List<String>> userList;

    public PhoneBook() {
        personList = new ArrayList<Person>();
    }

    public void addNumber() {

        System.out.print("whose number: ");
        this.userName = Main.reader.nextLine();

        for (Person p : personList) {
            if (!p.getName().equals(this.userName)) {
                personList.add(p);
            } else {
                System.out.println("Number is alredy in");
            }
        }

        Main.welcomeScream();
    }

    public String searchForNumber() {
        String input = Main.reader.next();

        return "No such entry";
    }

    public String searchForPersonByPhoneNumber() {
        String phoneNumber = Main.reader.next();

        return phoneNumber;
    }

    public void addAnAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void searchPersonalInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deletePersonalInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void filteredListing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
