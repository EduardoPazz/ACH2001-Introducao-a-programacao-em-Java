import java.util.Scanner;

public class Ex04 {

    static Scanner input = new Scanner(System.in);

    static double totalAPagar(boolean pagAnt, int quantHora, double valorHora) {
        return pagAnt ? quantHora * valorHora * .93 /* desconto de 7% */ : quantHora * valorHora; /* sem desconto */
    }

    public static void main(String args[]) {
        System.out.print("Valor/hora (use vírgula para casas decimais) : ");
        double valorHora = input.nextDouble();

        System.out.print("Quantidade de horas: ");
        int quantHora = input.nextInt();

        System.out.println("Tipo de pagamento:");
        System.out.println("(A): Antecipado");
        System.out.println("(B): Normal");

        switch (input.next()) {
            case "A":
                System.out.printf("O total a pagar ficou: R$%.2f\n", totalAPagar(true, quantHora, valorHora));
                break;
            case "B":
                System.out.printf("O total a pagar ficou: R$%.2f\n", totalAPagar(false, quantHora, valorHora));
                break;
        }
    }
}