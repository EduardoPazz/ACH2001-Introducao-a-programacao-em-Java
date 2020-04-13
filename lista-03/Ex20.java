import java.util.Scanner;

public class Ex20 {

    static Scanner input = new Scanner(System.in);

    static boolean eQuadradoPerfeito(long num) {
        long testNum = 0;
        for (long i = 1; testNum < num; i += 2) {
            testNum += i;
        }
        return testNum == num;
    }

    public static void main(String[] args) {
        System.out.print("Informe um suposto quadrado perfeito: ");
        long num = input.nextLong();
        System.out.format("%d é um quadrado perfeito? %b.", num, eQuadradoPerfeito(num));
    }
}