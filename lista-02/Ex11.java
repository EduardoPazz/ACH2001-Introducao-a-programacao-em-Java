import java.util.Scanner;

public class Ex11 {
    static Scanner input = new Scanner(System.in);

    static boolean divisivel(int dividendo, int divisor) {
        return (dividendo%divisor == 0);
    }

    public static void main(String[] args) {
        System.out.print("Forneça o suposto dividendo: ");
        int dividendo = input.nextInt();
        System.out.print("Forneça o suposto divisor: ");
        int divisor = input.nextInt();

        System.out.printf("%d é divisivel por %d? %b.", dividendo, divisor, divisivel(dividendo, divisor));
    }
}