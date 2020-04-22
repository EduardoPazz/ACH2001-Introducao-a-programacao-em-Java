class Ex05 {

    static float mediaNotas(byte[] array) {
        byte maior = -1;
        byte menor = 11;
        byte posicaoMenor = -1;
        byte posicaoMaior = -1;

        for (byte i = 0; i < array.length; i++) {
            if (maior < array[i]) {
                maior = array[i];
                posicaoMaior = i;
            }

            if (menor > array[i]) {
                menor = array[i];
                posicaoMenor = i;
            }
        }

        float nota = 0f;
        for (byte i = 0; i < array.length; i++) {
            if (i == posicaoMaior || i == posicaoMenor) continue;
            nota += array[i];
        }

        return nota / array.length;
    }

    public static void main(String[] args) {
        byte[] notas = {2, 2, 6, 4, 4, 8};
        System.out.println(mediaNotas(notas));
    }
}