import java.util.Scanner;

public class Ex25 {

    static Scanner input = new Scanner(System.in);

    static void matriz(long n) {
        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Informe o tamanho da matriz desejada: ");
        matriz(input.nextLong());
    }
}