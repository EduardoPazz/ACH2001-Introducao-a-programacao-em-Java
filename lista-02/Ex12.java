import java.util.Scanner;

public class Ex12 {
    static Scanner input = new Scanner(System.in);

    static boolean validacaoTringulo(int lado1, int lado2, int lado3) {
        boolean teste1 = (lado1 + lado2) > lado3; 
        boolean teste2 = (lado1 + lado3) > lado2;
        boolean teste3 = (lado2 + lado3) > lado1;

        return teste1 && teste2 && teste3;
    }

    public static void main(String[] args) {
        System.out.print("Forneça o primeiro lado: ");
        int lado1 = input.nextInt();
        System.out.print("Forneça o segundo lado: ");
        int lado2 = input.nextInt();
        System.out.print("Forneça o terceiro lado: ");
        int lado3 = input.nextInt();

        System.out.printf("É possível existir um triângulo de lados %d, %d e %d? %b.", lado1, lado2, lado3, validacaoTringulo(lado1, lado2, lado3));
    }
}