import java.util.Scanner;

public class Ex15 {

    static Scanner input = new Scanner(System.in);

    static void forMethod(byte n) {
        for (byte asterisk = n; asterisk > 0; asterisk--) System.out.print('*');
    }
    
    static void whileMethod(byte n) {
        byte asterisk = n;
        while (asterisk > 0) {
            System.out.print('*');
            asterisk--;
        }
    }

    static void doWhileMethod(byte n) {
        int asterisk = n;
        do {
            System.out.print('*');
            asterisk--;
        } while (asterisk > 0);
    }

    public static void main(String[] args) {
        System.out.print("Informe o número de caracteres: ");
        byte n = input.nextByte();

        System.out.print("Com for: ");
        forMethod(n);
        System.out.print("\nCom while: ");
        whileMethod(n);
        System.out.print("\nCom do...while: ");
        doWhileMethod(n);
    }
}