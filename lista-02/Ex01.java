class Ex01 {
    static void function1() {
        if (5 < 5) System.out.println("sim");
        System.out.println("  ́e a resposta.\n"); 
        
        /*  ́e a resposta.\n */
    }

    static void function2() {
        int var1 = 3;
        int var2 = 6;
        if ((var1 + 2) < var2) System.out.println("oba"); /* true */
        if ((var1 + 4) < var2) System.out.println("abo"); /* false */
        if ((var1 + 4) > var2) System.out.println("aob");
        System.out.println("ola\n");  
        
        /* 
            oba
            aob
            ola
        */
    }

    static void function3() {
        int a = 10;
        int b = 20;
        int c;
        if (a < b) c = a; /* true */
        else c = b; /* ignore */
        System.out.println(a+" "+b+" "+c); /* 10 20 10 */       
    }

    static void function4() {
        int a = 10;
        int b = 20;
        int c = (a < b) ? a : b; /* a */
        System.out.println(a+" "+b+" "+c); /* 10 20 10 */        
    }

    static void function5() {
        int a = 3;
        int b = 4;
        boolean continua = true && ((a + b) < (2 * a)); /* false */
        if (continua) System.out.println("alto"); /* ignore */
        else System.out.println("baixo"); 
        /* 
            baixo
        */
    }

    static void function6() {
            int a = 5;
            int b = 3;
            int c = 9;
            int aux;

            if (a>b) {
                aux = a; /* 5 */
                a = b; /* 3 */
                b = aux; /* 5 */
            }

            if (b>c) { /* ignore */
                aux = b;
                b = c;
                c = aux;
            }

            if (a>b) { /* ignore */
                aux = a;
                a = b;
                b = aux;
            }

            System.out.println(c+" "+b+" "+a); 
            /* 
                9 5 3
            */
    }     

    public static void main(String args[]) {
        function1();
        function2();
        function3();
        function4();
        function5();
        function6();
    }
}
