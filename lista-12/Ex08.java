import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Ex08 {
    static ArrayList<Boolean> lines = new ArrayList<Boolean>();

    static void readText(String word) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("fileEx08"))) {
            
            for (
                String line;
                (line = reader.readLine()) != null;
            ) {
                lines.add(isItIn(line, word));
            }
        }
        relatory(word);
    }

    static boolean isItIn(String line, String word) {
        try (Scanner scanner = new Scanner(line)) {
            while (scanner.hasNext()) {
                if (scanner.next().equals(word)) return true;
            }
        }

        return false;
    }

    static void relatory(String word) {
        for (int i = 1; i <= lines.size(); i++) {
            System.out.println(
                "\"" + word + "\" on line " + i + ":\t" + lines.get(i-1)
            );
        }
    }
    public static void main(String[] args) throws IOException {
        readText(args[0]);
    }    
}