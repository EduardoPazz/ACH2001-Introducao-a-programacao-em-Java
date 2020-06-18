import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex02 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("fileEx02"))) {
            int character;
            while ((character = in.read()) != -1) {
                if (65 <= character && character <= 90) character += 32;
                else if (97 <= character && character <= 122) character -= 32;

                System.out.print(character + " e ");
            }
        }
    }
}