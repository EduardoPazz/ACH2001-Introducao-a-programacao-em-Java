import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex01 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("fileEx01"))) {
            String num;
            while ((num = in.readLine()) != null) {
                System.out.println(num);
            }
        }
    }
}