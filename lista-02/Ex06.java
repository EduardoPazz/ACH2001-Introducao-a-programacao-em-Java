import java.util.Scanner;

public class Ex06 {

    static Scanner input = new Scanner(System.in);

    static double maior(double a, double b, double c) {
        double maior = a < b ? b : a;
        if (maior < c) maior = c;
        return maior;
    }

    public static void main(String args[]) {
        System.out.print("(A): ");
        double a = input.nextDouble();

        System.out.print("(B): ");
        double b = input.nextDouble();

        System.out.print("(C): ");
        double c = input.nextDouble();

        System.out.printf("O maior valor entre os três passados é %.2f\n", maior(a, b, c));
    }
}