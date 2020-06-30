import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Ex09 {
    static ArrayList<String> words = new ArrayList<String>();

    static void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("fileEx09"))) {
            ArrayList<Integer> characters = new ArrayList<Integer>();
            int character;

            while ((character = reader.read()) != -1) {
                if (character > 32) {
                    /* System.out.println((char) character + "\t" + character); */
                    characters.add(character);
                } else {
                    add(characters);
                    characters.clear();
                }
            }
            add(characters);
        }
    }

    static void add(ArrayList<Integer> characters) {
        int size;
        if ((size = characters.size()) < 1) return;

        char[] chars = new char[size];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) characters.get(i).intValue();
        }

        words.add(new String(chars));
    }

    static double average() {
        double sum = 0;

        for (String word : words) {
            sum += word.length();
        }

        return sum / words.size();
    }

    public static void main(String[] args) throws IOException {
        readFile();

        double average = average();

        System.out.println("The average of words' length is " + average + ".");
    }        
}