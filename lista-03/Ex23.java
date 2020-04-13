import java.util.Scanner;

public class Ex23 {

    static Scanner input = new Scanner(System.in);

    static long fatorial(long num) {
        if (num == 1) return 1;
        return num * fatorial(num - 1);
    }

    static double cos(double anguloRad) {
        char sinal = '-';
        double result = 1;
        for (long i = 2; i <= 20; i += 2) {
            switch (sinal) {
                case '-': result -= Math.pow(anguloRad, i)/fatorial(i);
                    break;
                case '+': result += Math.pow(anguloRad, i)/fatorial(i);
                    break;
            }
            sinal = sinal == '-' ? '+' : '-';
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Informe um ângulo (radiano) para que seja calculado seu cosseno: ");
        double anguloRad = input.nextDouble();
        System.out.format("\n%.2f rad\tcos(%.2f) = %.2f\n\n", anguloRad, anguloRad, cos(anguloRad));
    }
}