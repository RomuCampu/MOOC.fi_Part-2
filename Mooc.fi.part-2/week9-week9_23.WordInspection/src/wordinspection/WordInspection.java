package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private Scanner reader;
    private File file;
    private List<String> listWithZ;
    private List<String> wordsEnndWithL;
    private List<String> palindromes;

    public WordInspection(File file) {
        this.file = file;
        listWithZ = new ArrayList<String>();
        wordsEnndWithL = new ArrayList<String>();
        palindromes = new ArrayList<String>();
    }

    public int wordCount() throws Exception {

        int count = 0;
        reader = new Scanner(file, "UTF-8");

        while (reader.hasNextLine()) {
            count++;
            String line = reader.nextLine();

        }
        return count;
    }

    public List<String> wordsContainingZ() throws Exception {

        reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {

            String word = reader.next();

            if (word.contains("z")) {
                listWithZ.add(word);
            }
        }
        return listWithZ;
    }

    public List<String> wordsEndingInL() throws Exception {

        reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {

            String word = reader.next();

            if (word.endsWith("l")) {
                wordsEnndWithL.add(word);
            }

        }

        return wordsEnndWithL;
    }

    public List<String> palindromes() throws Exception {

        reader = new Scanner(file, "UTF-8");

        StringBuilder reversedWord;

        while (reader.hasNext()) {
            String word = reader.next();
            reversedWord = new StringBuilder(word);
            reversedWord = reversedWord.reverse();

            if (word.equals(reversedWord.toString())) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        List<String> wordsContainingVowels = new ArrayList<String>();
        String[] vowels = new String[]{"a", "e", "i", "o", "u", "y", "ä", "ö"};
        Scanner reader = new Scanner(file, "UTF-8");

        while (reader.hasNext()) {
            String word = reader.next();

            if (word.contains("a") && word.contains("e") && word.contains("i")
                    && word.contains("o") && word.contains("u") && word.contains("y")
                    && word.contains("ä") && word.contains("ö")) {
                wordsContainingVowels.add(word);
            }
        }
        return wordsContainingVowels;
    }
}
