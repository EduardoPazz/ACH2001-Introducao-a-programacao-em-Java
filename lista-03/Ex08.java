public class Ex08 {
    public static void main(String[] args) {
        for (short num = 1; num <= 15; num++) {
            System.out.print(num + "\t");
            System.out.print(Math.pow(num, 2) + "\t");
            System.out.print(Math.pow(num, 3) + "\n");
        }
    }
}