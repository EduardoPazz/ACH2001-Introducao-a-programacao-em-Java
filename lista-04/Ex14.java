class Ex14 {
    static int[] poliSoma(int[] poliA, int[] poliB) {
        int[] poliSoma = new int[poliA.length];

        for (int i = 0; i < poliA.length; i++) { 
            poliSoma[i] = poliA[i] + poliB[i];
        }

        return poliSoma;
    }

    public static void main(String[] args) {
        int[] poliA = new int[3];
        int[] poliB = new int[3];

        poliA[0] = 1;
        poliA[1] = -2;
        poliA[2] = 1;

        poliB[0] = 1;
        poliB[1] = -2;
        poliB[2] = 1;

        int[] poliSoma = poliSoma(poliA, poliB);

        for (int i = 0; i < poliSoma.length; i++) {
            System.out.format("%dx^%d ", poliSoma[i], i);   
        }
    }
}