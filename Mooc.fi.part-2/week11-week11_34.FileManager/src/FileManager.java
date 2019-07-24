
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private Scanner reader;
    private File file;

    public FileManager() {

    }

    public List<String> read(String file) throws FileNotFoundException {

        List<String> result = new ArrayList<String>();
        this.file = new File(file);
        reader = new Scanner(this.file);

        if (this.file.exists()) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                result.add(line);
            }
            return result;
        } else {
            reader.close();
            return null;
        }
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {

        FileWriter writer = new FileWriter(file);

        for (String s : texts) {
            writer.write(s);
            writer.write("\n");
        }
        writer.close();
    }
}
