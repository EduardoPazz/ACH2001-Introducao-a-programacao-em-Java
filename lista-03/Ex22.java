import java.util.Scanner;

public class Ex22 {

    static Scanner input = new Scanner(System.in);

    static long fatorial(long num) {
        if (num == 1) return 1;
        return num * fatorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.print("Informe um número para que seja calculado seu fatorial: ");
        System.out.println(fatorial(input.nextLong()));
    }
}