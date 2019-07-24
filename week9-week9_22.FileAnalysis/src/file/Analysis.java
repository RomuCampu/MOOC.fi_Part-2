package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private Scanner reader;
    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {

        int count = 0;
        reader = new Scanner(file, "UTF-8");

        while (reader.hasNextLine()) {

            count++;
            String word = reader.nextLine();

        }
        return count;
    }
    
    public int characters() throws Exception {
        
        int count = 0;
        reader = new Scanner(file, "UTF-8");
        
        while(reader.hasNext()) {
            String line = reader.nextLine();
            count += line.length();
        }
        
        return count + lines();
    }
}
