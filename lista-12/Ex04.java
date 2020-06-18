import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ex04 {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader inA = new BufferedReader(new FileReader("fileEx04A"));
            BufferedReader inB = new BufferedReader(new FileReader("fileEx04B"));
            BufferedWriter outA = new BufferedWriter(new FileWriter("fileEx04A", true));
        ) {
            String line;
            while ((line = inB.readLine()) != null) {
                System.out.println(line);
                outA.write(line);
            }
        }
    }
}