import java.util.Scanner;

public class Ex24 {

    static Scanner input = new Scanner(System.in);

    static final double log2 = Math.log(2);

    static double ePotenciaDeDois(long num) {
        long expoente = (long) (Math.log(num) / log2);
        double prova = Math.pow(2, expoente);
        return prova == num ? prova : -1;
    }

    public static void main(String[] args) {
        System.out.print("Informe um número para que seja testado se ele é potência de dois (-1 significa que não): ");
        System.out.println(ePotenciaDeDois(input.nextLong()));
    }
}