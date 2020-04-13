public class Ex13 {
    public static void main(String[] args) {
        for (byte linha = 1; linha <= 5; linha++) {
            for (byte coluna = 1; coluna <= 10; coluna++) {
                if (linha == 1 || linha == 5) {
                    System.out.print("*");
                    continue;
                }

                if (coluna == 1 || coluna == 10) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}