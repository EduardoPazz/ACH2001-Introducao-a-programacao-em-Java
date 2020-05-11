import java.util.Scanner;

class Ex17 {
    static Scanner input = new Scanner(System.in);

    static String isPower(long num) {
        if (num == 2) return (
            2 + " is a power of 2:\t" + 2 + "^" + 1 + "."
        );

        float power = (float) (
            Math.log(num) /
            Math.log(2)
        );

        if ( power % 2 == 0) return (
            num + " is a power of 2:\t" + 2 + "^" + (byte) power + "."
        ); else return (
            num + " is not a power of 2."
        );
    }

    public static void main(String[] args) {
        boolean test;

        do {
            System.out.print(
                "\nProvide a number to test whether it is a power of 2: "
            );
            long num = input.nextLong();

            System.out.print(
                "\nAbout " + num + ":\n" + isPower(num) + "\n\n" +
                "Continue [ y ] ?: "
            );

            test = input.next().charAt(0) == 'y';
        } while (test);
    }
}