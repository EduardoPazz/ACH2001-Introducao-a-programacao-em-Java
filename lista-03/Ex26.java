import java.util.Scanner;

public class Ex26 {

    static Scanner input = new Scanner(System.in);

    static void floyd(byte n) {
/*         for (short i = 1, rowLimit = 1; i <= n; i++, rowLimit++) {
            for (byte row = 1; row <= rowLimit ; row++) System.out.print(i + "\t");
            System.out.println();
        } */
        short i = 1;
        for (byte rowNumber = 1, rowLength = 1; rowNumber <= n ; rowLength++, rowNumber++) {
            for (byte numbersLimit = 1; numbersLimit <= rowLength; i++, numbersLimit++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Informe o tamanho do Triângulo de Floyd desejado: ");
        floyd(input.nextByte());
    }
}