import java.util.Scanner;

public class Ex10 {
    static Scanner input = new Scanner(System.in);

    static int validacaoCiclone(double velocidade) {
        if (velocidade < 62) {return -1;}

        if (62 <= velocidade && velocidade <= 118) {return 0;}

        if (velocidade <= 153) {return 1;}

        if (velocidade <= 177) {return 2;}

        if (velocidade <= 209) {return 3;}

        if (velocidade <= 249) {return 4;}

        if (249 < velocidade ) {return 5;}

        return -1;
    }
    public static void main(String args[]) {
        System.out.print("Informe a velocidade do ciclone, em km/h: ");
        switch (validacaoCiclone(input.nextDouble())) {
            case -1:
                System.out.print("Este não é válido para classificar um ciclone.");
                break;
            case 0:
                System.out.print("Este ciclone é classificado como TEMPESTADE TROPICAL.");
                break;
            case 1:
                System.out.print("Este ciclone é classificado como FURACÃO NÍVEL 1.");
                break;
            case 2:
                System.out.print("Este ciclone é classificado como FURACÃO NÍVEL 2.");
                break;
            case 3:
                System.out.print("Este ciclone é classificado como FURACÃO NÍVEL 3.");
                break;
            case 4:
                System.out.print("Este ciclone é classificado como FURACÃO NÍVEL 4.");
                break;
            case 5:
                System.out.print("Este ciclone é classificado como FURACÃO NÍVEL 5.");
                break;
        }
    }
}