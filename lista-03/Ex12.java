public class Ex12 {
    public static void main(String[] args) {
        for (int cont1 = 1; cont1 <= 5; cont1++) {
            for (int cont2 = cont1; cont2 >= 1; cont2--) System.out.print(cont2);
            System.out.println();
        }

        /* 
            1
            21
            321
            4321
            54321
        */
    }
}