import java.util.Scanner;

public class Ex16 {

    static Scanner input = new Scanner(System.in);

    static void jurosCompostos(double pv, float i, short n) {
        for (short mes = 1; mes <= n; mes++) {
            double montante = pv * Math.pow(i, mes); 
            System.out.format("\nMês de referência: %d\tMontante acumulado: R$%.2f", mes, montante);
        }
    }

    public static void main(String[] args) {
        System.out.print("Informe o valor presente (PV): ");
        double pv = input.nextDouble();

        System.out.print("Informe a taxa de juros mensal (%): ");
        float i = (100 + input.nextFloat()) / 100;

        System.out.print("Informe o prazo em meses: ");
        short n = input.nextShort();
        
        jurosCompostos(pv, i, n);
    }
}