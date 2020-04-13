import java.util.Scanner;

public class Ex17 {

    static Scanner input = new Scanner(System.in);

    static boolean ePrimo(long num) {
        if (num % 2 == 0) return false;

        for (long i = num - 2; i >= 3; i -= 2) if (num % i == 0) return false;
            /* 
                * subtrai 2 do número teste porque sempre na primeira iteração a conta acusará uma divisão inteira
                * fiz a iteração descer até 3 porque descer até 2 seria par (e já teria sido acusado anteriormente) e até 1 não vale para testar se não é primo
                * o iterador descresce de 2 em 2 porque não vale a pena testar números pares
            */
        
        return true; // se o número passar dos dois testes, quer dizer que é primo
    }

    public static void main(String[] args) {
        System.out.print("Informe o número inteiro: ");
        long num = input.nextLong();
        
        System.out.format("%d é primo? %b\n", num, ePrimo(num));
    }
}