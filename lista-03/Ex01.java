class Ex01 {
    static void functionA() {
        int soma = 33;
        int cont = 1;
        while (cont < 12) {
            soma = soma + cont; // 33; 34; 37; 42; 49; 58; 69
            cont = cont + 2; // 1; 3; 5; 7; 9; 11; 13
        }
        System.out.println("Os números são: " + cont + " e " + soma); // 11 e 69
    }

    static void functionB() {
        int num = 0;
        while (num <= 5) {
            num = num + 1;
            System.out.println(num);
            /* 
                1
                2
                3
                4
                5
                6
            */
        }
    }

    static void functionC() {
        int dest1 = 15;
        int dest2 = 27;
        int local1 = 20;
        int local2 = 20;
        boolean chegou1 = false;
        boolean chegou2 = false;

        while (!(chegou1) && !(chegou2)) {
            local1 = local1 - 1; // se move uma unidade por instante | 20; 19
            local2 = local2 + 2; // se move 2x mais rápido | 20; 22

            chegou1 = local1 <= dest1;
            chegou2 = local2 >= dest2;

            System.out.println("Os viajantes estão em " + local1 + " e " + local2);
            /* 
                19 e 22
                18 e 24
                17 e 26
                16 e 28
            */
        }

        System.out.println("As posições finais dos viajantes são " + local1 + " e " + local2); // 16 e 28
    }
    public static void main (String args[]) {
        functionA();
        functionB();
        functionC();
    }
}