package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> dictionary;
    private String file;
    private Scanner reader;

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        this.dictionary = new HashMap<String, String>();
        this.file = file;
    }

    public boolean save() {

        FileWriter writer;
        try {
            writer = new FileWriter(file);
            for (String key : this.dictionary.keySet()) {
                writer.write(key + ":" + this.dictionary.get(key));
                writer.write("\n");
            }

            writer.close();
            return true;
        } catch (IOException ioe) {
            return false;
        }
    }

    public boolean load() {

        try {
            File f = new File(this.file);
            reader = new Scanner(f);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] duo = line.split(":");
                this.dictionary.put(duo[0], duo[1]);
            }
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            this.dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        for (Map.Entry<String, String> iterator : dictionary.entrySet()) {
            if (iterator.getKey().equals(word)) {
                return iterator.getValue();
            } else if (iterator.getValue().equals(word)) {
                return iterator.getKey();
            }
        }
        return null;
    }

    public void remove(String word) {
        if (this.dictionary.containsValue(word)) {
            this.dictionary.values().remove(word);
        } else if (this.dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }
}
