import java.util.Scanner;

public class Ex03 {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("VAR: ");
        int var = input.nextInt();
        if (var < 4 || var > 10) System.out.println("fora");
    }
}