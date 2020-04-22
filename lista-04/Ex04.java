class Ex04 {

    static byte posicaoMaior(long[] array) {
        long maior = -9999999;
        byte posicao = -1;
        for (byte i = 0; i < array.length; i++) if (maior <= array[i]) {
            maior = array[i];
            posicao = i;
        }
        return posicao;
    }

    static byte posicaoMenor(long[] array)  {
        long menor = 9999999;
        byte posicao = -1;
        for (byte i = (byte) (array.length - 1); i >= 0; i--) if (menor >= array[i]) {
            menor = array[i];
            posicao = i;
        }
        return posicao;
    }

    public static void main(String[] args) {
        long[] numeros = {2, 2, 88, 88};
        System.out.println(posicaoMaior(numeros));
        System.out.println(posicaoMenor(numeros));
    }
}