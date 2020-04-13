import java.util.Scanner;

public class Ex21 {

    static Scanner input = new Scanner(System.in);

    static void matrizID(long n) {
        char character;

        for (long i = 1; i <= n; i++) {
            for (long j = 1; j <= n; j++) {
                character = j == i ? ':' : '+' ;
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Informe o tamanho da matriz identidade desejada: ");
        matrizID(input.nextLong());
    }
}