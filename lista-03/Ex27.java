import java.util.Scanner;

public class Ex27 {

    static Scanner input = new Scanner(System.in);

    static long produto(long fator, long repetidor) {
        long produto = 0;
        for ( ; repetidor > 0; repetidor--) produto += fator;
        return produto;
    }

    static long quociente(long dividendo, long divisor) {
        if (dividendo < divisor) return -1; //erro

        long quociente = 0;
        for ( ; 0 <= dividendo - divisor; dividendo -= divisor) quociente++;
        return quociente;
    }

    static long resto(long dividendo, long divisor) {
        if (dividendo < divisor) return divisor - dividendo;

        while (divisor < dividendo) dividendo -= divisor;
        return dividendo == divisor ? 0 : divisor - dividendo;        
    }

    public static void main(String[] args) {
        System.out.print("Informe A: ");
        long a = input.nextLong();

        System.out.print("Informe B: ");
        long b = input.nextLong();

        System.out.println(produto(a, b));
        System.out.println(quociente(a, b));
        System.out.println(resto(a, b));
    }
}