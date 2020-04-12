import java.util.Scanner;

public class Ex07 {

    static Scanner input = new Scanner(System.in);

    static double fahToCel(double fah) {return(fah-32) * 5/9;}
    static double celToFah(double cel) {return 9*cel/5+32;}

    public static void main(String args[]) {
        System.out.println("Escolha uma conversão:");
        System.out.println("(A): Fahrenheit para Celsius");
        System.out.println("(B): Celsius para Fahrenheit");
        String conversao = input.next();

        System.out.print("Informe os graus: ");
        double grau = input.nextDouble();
        switch (conversao) {    
            case "A":
                System.out.printf("%.2fº Fahrenheit são %.2fº Celsius ", grau, fahToCel(grau));
                break;
            case "B":
                System.out.printf("%.2fº Celsius são %.2fº Fahrenheit ", grau, celToFah(grau));
                break;
        }

        
    }
}