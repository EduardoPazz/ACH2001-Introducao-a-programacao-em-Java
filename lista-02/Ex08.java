import java.util.Scanner;

public class Ex08 {

    static Scanner input = new Scanner(System.in);

    static String maisVelha(int ano1st, int mes1st, int dia1st, int ano2nd, int mes2nd, int dia2nd, String data1st, String data2nd) {
        String maior = "";
        boolean iguais = true;

        if (ano1st != ano2nd) {
            maior = (ano1st < ano2nd) ? data1st : data2nd;
            iguais = false;
        } else if (mes1st != mes2nd) {
            maior = (mes1st < mes2nd) ? data1st : data2nd;
            iguais = false;
        } else if (dia1st != dia2nd) {
            maior = (dia1st < dia2nd) ? data1st : data2nd;
            iguais = false;
        }

        if (!iguais) return "A data mais velha é " + maior;

        return "As datas são iguais\n";
    };

    public static void main(String args[]) {
        System.out.print("Informe o ano da primeira data:");
        int ano1st = input.nextInt();
        System.out.print("Informe o mês da primeira data:");
        int mes1st = input.nextInt();
        System.out.print("Informe o dia da primeira data:");
        int dia1st = input.nextInt();

        String data1st =  Integer.toString(dia1st) + "/" +  Integer.toString(mes1st) + "/" +  Integer.toString(ano1st);
        System.out.println(data1st);
        
        System.out.print("Informe o ano da segunda data:");
        int ano2nd = input.nextInt();
        System.out.print("Informe o mês da segunda data:");
        int mes2nd = input.nextInt();
        System.out.print("Informe o dia da segunda data:");
        int dia2nd = input.nextInt();
        
        String data2nd =  Integer.toString(dia2nd) + "/" +  Integer.toString(mes2nd) + "/" +  Integer.toString(ano2nd);
        System.out.println(data2nd);
        
        System.out.print(maisVelha(ano1st, mes1st, dia1st, ano2nd, mes2nd, dia2nd, data1st, data2nd));        
    }
}