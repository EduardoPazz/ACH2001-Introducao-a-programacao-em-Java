import java.util.Scanner;

public class Ex14 {

    static Scanner input = new Scanner(System.in);

    static void reactangle(byte x, byte y) {
        for (byte linha = 1; linha <= y; linha++) {
            for (byte coluna = 1; coluna <= x; coluna++) {
                if (linha == 1 || linha == y) {
                    System.out.print("*");
                    continue;
                }

                if (coluna == 1 || coluna == x) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }        
    }

    public static void main(String[] args) {
        byte comprimento;
        byte altura;

        do {
            System.out.print("Forneça o comprimento: ");
            comprimento = input.nextByte();
        } while (comprimento <= 1);
        
        do {
            System.out.print("Forneça a altura: ");
            altura = input.nextByte();
        } while (altura <= 1);

        reactangle(comprimento, altura);
    }
}