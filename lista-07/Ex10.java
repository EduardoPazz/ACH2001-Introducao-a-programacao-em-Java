import java.util.Scanner;
import static java.lang.Math.*;

class Ex10 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean finish;

        do {
            System.out.print("Provide a number: ");
            float number = input.nextFloat();

            System.out.println(
                "The absolute value of " + 
                number + 
                " is " +
                abs(number)
            );

            System.out.print("Continue [y]? ");
            finish = input.next().charAt(0) == 'y';
        } while (finish);
    }
}