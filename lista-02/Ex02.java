import java.util.Scanner;

public class Ex02 {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        

        System.out.print("A: ");
        int a = input.nextInt();

        System.out.print("B: ");
        int b = input.nextInt();

    

        if (a > 0 && a < b) {
            int c = a;
            System.out.println(c);
        };
    }
}