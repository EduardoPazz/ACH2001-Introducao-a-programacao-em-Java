import java.util.Scanner;

public class Ex19 {

    static Scanner input = new Scanner(System.in);

    static void tabuada(long fator, long linhas) {
        for (long i = 1; i <= linhas; i++) {
            System.out.format("%d * %d = \t%d\n", i, fator, i * fator);
        }
    }

    public static void main(String[] args) {
        System.out.print("Informe de qual número a tabuada será: ");
        long fator = input.nextLong(); 
        System.out.print("Informe quantas linhas a tabuada terá: ");
        long linhas = input.nextLong(); 

        tabuada(fator, linhas);
    }
}