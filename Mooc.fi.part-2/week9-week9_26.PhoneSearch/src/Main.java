
import java.util.Scanner;

public class Main {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        welcomeScream();
    }

    public static void welcomeScream() {

        PhoneBook app = new PhoneBook();
        System.out.println("phone search\navailable operations:");

        System.out.println(" 1 add a number "
                + "\n 2 search for a number "
                + "\n 3 search for a person by phone number "
                + "\n 4 add an address "
                + "\n 5 search for personal information "
                + "\n 6 delete personal information "
                + "\n 7 filtered listing "
                + "\n x quit");

        String userInput = reader.next();

        while (true) {
            if (userInput.equalsIgnoreCase("x")) {
                break;
            } else if (userInput.equals("1")) {
                app.addNumber();
            } else if (userInput.equals("2")) {
                app.searchForNumber();
            } else if (userInput.equals("3")) {
                app.searchForPersonByPhoneNumber();
            } else if (userInput.equals("4")) {
                app.addAnAddress();
            } else if (userInput.equals("5")) {
                app.searchPersonalInfo();
            } else if (userInput.equals("6")) {
                app.deletePersonalInfo();
            } else if (userInput.equals("7")) {
                app.filteredListing();
            }
        }
    }
}
