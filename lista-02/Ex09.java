import java.util.Scanner;

public class Ex09 {

    static Scanner input = new Scanner(System.in);

    /* Quanto vale, em metros, cada unidade de medida */
    static final double pe = .000304794;
    static final double jarda = .000914382;
    static final double milha = 1.60931232;
    static final double polegada = .0000253995;

    static double pe(double pes) {return pes*pe;}
    static double jarda(double jar) {return jar*jarda;}
    static double milha(double mil) {return mil*milha;}
    static double polegada(double pol) {return pol*polegada;}

    public static void main(String args[]) {
        System.out.println("Informe a unidade de medida que será convertida para quilômetro: ");
        System.out.println("[A]: Pés");
        System.out.println("[B]: Jardas");
        System.out.println("[C]: Milhas");
        System.out.println("[D]: Polegadas");
        String conversao = input.next();

        System.out.print("Informe o módulo da grandeza: ");
        double mod = input.nextDouble();

        switch (conversao) {
            case "A":
                System.out.printf("%.2f pé(s) equivale(m) a %.5f quilômetros.", mod, pe(mod));
                break;
            case "B":
                System.out.printf("%.2f jarda(s) equivale(m) a %.5f quilômetros.", mod, jarda(mod));
                break;
            case "C":
                System.out.printf("%.2f milha(s) equivale(m) a %.5f quilômetros.", mod, milha(mod));
                break;
            case "D":
                System.out.printf("%.2f polegada(s) equivale(m) a %.5f quilômetros.", mod, polegada(mod));
                break;                                
        }
    }
}