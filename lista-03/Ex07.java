public class Ex07 {

    static void serieA() {
        for (byte num = 3; num <= 48; num += 5) System.out.print(num + " ");
    }

    static void serieB() {
        for (byte num = -2; num <= 43; num += 5) System.out.print(num + " ");
    }

    static void serieC() {
        for (byte num = 48; num >= 3; num -= 5) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        serieA();
        System.out.println();
        serieB();
        System.out.println();
        serieC();
    }
}