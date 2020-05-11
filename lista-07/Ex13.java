import java.util.Scanner;

class Ex13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean finish;
        byte counter = 0;
        short sum = 0;

        do {
            System.out.print("Provide a number to add: ");
            sum += input.nextFloat();

            counter++;

            System.out.print("Continue [y]? ");
            finish = input.next().charAt(0) == 'y';
        } while (finish);

        System.out.println(
            "The avarage is " +
            sum / counter
        );
    }
}
