import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex03 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("fileEx03"))) {
            int character;
            int characterCount = 0;
            int wordCount = 1;

            while ((character = in.read()) != -1) {
                if (character == 10 || character == 32) wordCount++;
                else characterCount++;
            }

            System.out.println(
                "The text from this file has " +
                characterCount + " letters and " +
                wordCount + " words."
            );
        }
    }
}