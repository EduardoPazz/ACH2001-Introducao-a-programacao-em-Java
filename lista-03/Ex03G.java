public class Ex03G {
    static void horiz() {
        for (int comp = 1; comp < 11; comp++) System.out.print("*");
        System.out.println();
    }

    static void lado() {
        System.out.print("*");
        for (int espaco = 1; espaco <= 8; espaco++) System.out.print(" ");
            System.out.println("*");
    }
    public static void main(String[] args) {
        horiz();
        /* 
            **********
        */

        for (int vert = 1; vert < 7; vert++) lado(); // 6x
        /* 
            *         *
            *         *
            *         *
            *         *
            *         *
            *         *
        */                                               
        horiz();
        /* 
            **********
        */
    }
}