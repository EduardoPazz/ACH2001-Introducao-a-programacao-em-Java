import java.util.Scanner;

public class Ex05 {

    static Scanner input = new Scanner(System.in);

    static double acrescimo(String metodoPag, double totalAVista) {
        switch (metodoPag) {
            case "2x":
                return totalAVista * 1.1; /* acrescimo de 10% */
            default:
                return totalAVista * 1.2; /* acrescimo de 20% */
        }
    }

    public static void main(String args[]) {
        System.out.print("Valor total a vista da compra: R$");
        double totalAVista = input.nextDouble();

        System.out.println("Parcelar? ");
        System.out.println("(A): Não, vai a vista mesmo.");
        System.out.println("(B): Quero em 2 meses");
        System.out.println("(C): Quero em 3 meses");
        switch (input.next()) {
            case "A":
                System.out.printf("O total a pagar ficou: R$%.2f\n", totalAVista);
                break;
            case "B":
                System.out.printf("O total a pagar ficou: R$%.2f\n", acrescimo("2x", totalAVista));
                break;
            case "C":
                System.out.printf("O total a pagar ficou: R$%.2f\n", acrescimo("3x", totalAVista));
                break;
        }
    }
}