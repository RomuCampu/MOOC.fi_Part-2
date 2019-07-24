
import java.io.File;
import java.util.Scanner;

public class Printer {

    private File file;
    private Scanner reader;
    private String fileName;

    public Printer(String fileName) throws Exception {

        this.fileName = fileName;
        file = new File(fileName);

    }

    public void printLinesWhichContain(String word) throws Exception {
        
        reader = new Scanner(file, "UTF-8");
        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
