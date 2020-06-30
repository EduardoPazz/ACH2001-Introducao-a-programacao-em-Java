import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex07 {
    static boolean isDiff() throws IOException {
        try (
            BufferedReader readerA = new BufferedReader(new FileReader("fileEx07a"));
            BufferedReader readerB = new BufferedReader(new FileReader("fileEx07b"));
        ) {
            int characterA;
            int characterB;

            while ((characterA = readerA.read()) != -1) {
                characterB = readerB.read();
                if (characterA != characterB) return true;
            }

            characterB = readerB.read();
            if (characterA != characterB) return true;
            return false;
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Is different?\t" + isDiff()); 
    }        
}