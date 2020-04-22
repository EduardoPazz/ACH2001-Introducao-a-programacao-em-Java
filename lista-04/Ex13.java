class Ex13 {
    static int[] derivada(int[] polinomio) {
        int[] derivada = new int[polinomio.length - 1];

        for (int i = 0; i < polinomio.length - 1; i++) { 
            derivada[i] = (i+1) * polinomio[i+1];
        }

        return derivada;
    }

    public static void main(String[] args) {
        int[] polinomio = new int[3];

        polinomio[0] = 1;
        polinomio[1] = -2;
        polinomio[2] = 1;

        int[] derivada = derivada(polinomio);

        for (int i = 0; i < derivada.length; i++) {
            System.out.format("%dx^%d ", derivada[i], i);   
        }
    }
}