import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex06 {
    static final byte L = 0; // L for Letter
    static final byte C = 1; // C for Counter

    static int[][] alphabet = new int[26][2];

    static void fillAlphabet() {
        for (int i = 0, l = 97; i < alphabet.length; i++, l++) {
            alphabet[i][L] = l;
            alphabet[i][C] = 0;
        }
    }

    static void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("fileEx06"))) {
            int character;
            while ((character = reader.read()) != -1) {
                binarySearch(character);
            }
        }
    }

    static void binarySearch(int key) {
        int min = 0;
        int max = alphabet.length;
        int middle;
    
        while (min <= max) {
            middle = (max + min) / 2;
    
            if (key == alphabet[middle][L]) {
                alphabet[middle][C]++;
                return;
            }
    
            if (key > alphabet[middle][L]) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
        }
    }

    static void findAndCountLetter() {

    }
    public static void main(String[] args) throws IOException {
        fillAlphabet();

        readFile();

        for (int[] l : alphabet) {
            System.out.println((char) l[L] + "\t" + l[C]);
        }
    }
}