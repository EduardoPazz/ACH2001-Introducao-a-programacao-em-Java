class Ex12 {
    static short polinomio(byte[][] polinomio, byte x) {
        short resultado = 0;

        for (byte i = 0; i < polinomio.length; i++) { 
            polinomio[i][1] = (byte) Math.pow(x, i);
            resultado += polinomio[i][0] * polinomio[i][1];
        }

        return resultado;
    }

    public static void main(String[] args) {
        byte n = 5;
        
        byte[][] polinomio = new byte[n][2];

        /* [0] coeficiente | [1] variável */

        polinomio[0][0] = 5;
        polinomio[1][0] = -4;
        polinomio[2][0] = 7;
        polinomio[3][0] = 9;
        polinomio[4][0] = -6;

        System.out.println(polinomio(polinomio, (byte) 5));
    }
}