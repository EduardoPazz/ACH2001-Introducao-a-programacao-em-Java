import java.util.Scanner;

class Ex10 {
    static Scanner input = new Scanner(System.in);

    static int originalNumber;
    static int hundred;
    static int hundredStage;
    static int ten;
    static int unit;

    public static void main(String[] args) {
        System.out.print("Provide a 3 places number: ");
        originalNumber = input.nextInt();

        hundred = originalNumber/100;
        hundredStage = (originalNumber - hundred * 100);
        ten = hundredStage / 10;
        unit = hundredStage % 10;

        System.out.printf("Number inverted: %s%s%s \n", unit, ten, hundred);
    }
}