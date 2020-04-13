class Ex03 {
    static void functionA() {
        int num = 0;
        do {
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
        } while (num <= 5); 
    }

    static void functionB() {
        int num = 6;
        do {
            num = num + 1;
            System.out.println(num); // 7
        } while (num <= 5);
    }

    static void functionC() {
        for (int cont = 1; cont <= 5; cont ++) System.out.println("Oi");
        /* 
            Oi
            Oi
            Oi
            Oi
            Oi
        */
    }

    static void functionD() {
        for (int cont = 1; cont <= 5; cont ++) System.out.print("Oi"); // OiOiOiOiOi
    }

    static void functionE() {
        for (int cont = 1; cont <= 5; cont ++) {
            System.out.print("Oi");
            System.out.print(" Artur");

            /* 
                Oi ArturOi ArturOi ArturOi ArturOi Artur
            */
        }
    }

    static void functionF() {
        for (int cont = 1; cont <= 5; cont ++) {
            System.out.print("Oi");
            System.out.print("Artur");
            
            /* 
                OiArturOiArturOiArturOiArturOiArtur
            */
        }
    }
    
    public static void main (String args[]) {
        functionA();
        functionB();
        functionC();
        functionD();
        functionE();
        functionF();
    }
}