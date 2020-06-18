import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Ex05 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader in = new BufferedReader(new FileReader("fileEx05"))) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int quant = 0;
            int sum = 0;
            int realNum = 0;
            String num = "";

            int character;

            while ((character = in.read()) != -1) {
                if (character == 44 /* , */) {
                    realNum = Integer.parseInt(num);
                    if (realNum < min) min = realNum;
                    if (realNum > max) max = realNum;
                    sum += realNum;
                    quant++;
                    num = "";
                } else if (48 <= character && character <= 57) {
                    num += new String(new char[] {(char) character}); // The String constructor does not accept a single char. So, I have to create a lenght 1 array to store the number.
                } 
            }

            double media = sum / quant;

            System.out.println(
                "Estatística Descritiva:" +
                "\nValor Mínimo:\t" + min +
                "\nValor Máximo:\t" + max +
                "\nFrequência Total:\t" + quant +
                "\nMédia:\t\t" + media
            );
        }
    }
}