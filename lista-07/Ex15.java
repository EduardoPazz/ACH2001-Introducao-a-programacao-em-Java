import java.util.Scanner;

class Ex15 {
    static Scanner input = new Scanner(System.in);

    static void printPrimes(byte quant) {
        System.out.println(2);

        if (quant == 1) return;

        boolean test = true;

        primes: for (
            short j = 3, counter = 0;
            counter < quant - 1;
            j += 2
        ) {
            testers: for (short k = 3; k < j; k += 2) {
                test = j % k == 0;
            }

            if (!test) {
                System.out.println(j);
                counter++;
            } else test = false;
            
        }
    }

    public static void main(String[] args) {
        System.out.print(
            "Provide the quantity of primes to be outputed: "
        );
        byte quant = input.nextByte();

        printPrimes(quant);
    }
}