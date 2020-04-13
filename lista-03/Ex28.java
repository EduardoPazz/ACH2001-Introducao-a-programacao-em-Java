import java.util.Scanner;

public class Ex28 {

    static Scanner input = new Scanner(System.in);

    static long cubo(long num) {
        long total = num * (num - 1) + 1;
        for (long acumulador = total + 2; num > 1 ; num--, acumulador += 2) total += acumulador;
        return total;
    }

    public static void main(String[] args) {
        System.out.print("Informe um número para obter seu cubo: ");
        long num = input.nextLong();
        System.out.format("%d^3\t%d", num, cubo(num));
    }
}