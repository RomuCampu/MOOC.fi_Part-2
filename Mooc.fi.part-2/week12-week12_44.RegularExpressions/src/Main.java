
import java.util.Scanner;

public class Main {

    private final static Scanner READER = new Scanner(System.in);

    public static void main(String[] args) {
        // write test code here
        System.out.print("Give a string: ");
        String string = READER.nextLine();
        if (clockTime(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
    }

    public static boolean isAWeekDay(String string) {
        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public static boolean allVowels(String string) {

        String[] temp = string.split("");
        int isItAVowel = 0;
        for (String temp1 : temp) {
            if (temp1.matches("a|e|i|o|u|ä|ö")) {

            } else {
                isItAVowel++;
            }
        }
        return isItAVowel < 1;
    }

    public static boolean clockTime(String string) {

        
        if (string.matches("\\d\\d:\\d\\d:\\d\\d")) {
            String[] hms = string.split(":");
            return (Integer.parseInt(hms[0]) <= 23 &&
                    Integer.parseInt(hms[1]) <= 60 &&
                    Integer.parseInt(hms[2]) <= 60 );
        }
        return false;
    }
}
