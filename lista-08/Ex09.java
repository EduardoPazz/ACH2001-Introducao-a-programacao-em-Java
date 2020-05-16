import java.util.Scanner;

class Ex09 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        short max = (short) (Math.random() * (Short.MAX_VALUE + 1));
        short min = 0;
        short middle = 0;
        byte tries = (byte) (Math.log(max-1) / Math.log(2));

        System.out.format(
            "Imagine a number between 0 and %d" +
            " and I'll guess it.\n\n" + 
            "Rules:\n" +
            "1. I'll have %d chances to try;\n" +
            "2. I'll ask you if my try is correct or" +
            " lower / greater than your your number," +
            " and you'll answer HONESTLY!\n" +
            "\nSince you've imagined a number, type some character and press enter to begin: ",
            --max, tries
        );

        input.next();

        boolean playerWins = true;

        System.out.println("---------------------------");

        guessing: for (byte i = 1; i <= tries; i++) {

            middle = (short) ((max + min) / 2);

            System.out.println("---------------------------");

            System.out.format(
                "\nTry Nº%d: %d\n\n" + 
                "[1] It is your number\n" +
                "[2] It is greater than your number\n" +
                "[3] It is lower than your number\n\n: ",
                i, middle
            );


            switch (input.nextByte()) {
                case 1: playerWins = false;
                    break guessing;
                case 2: max = (short) (middle - 1);
                    break;
                case 3: min = (short) (middle + 1);
                    break;
            }
        }

        if (playerWins) {
            System.out.println("\n---------------------------");
            System.out.println(
                "Damn it! You won... Congrats... See ya next time!"
            );
        } else {
            System.out.println("\n---------------------------");
            System.out.format(
                "Oh, I guessed it right! Your number is %d. " +
                "It was great to play with you. See ya next time!\n",
                middle
            );
        }
    }
}