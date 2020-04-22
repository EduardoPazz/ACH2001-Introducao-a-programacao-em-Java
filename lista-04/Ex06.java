class Ex06 {

    static float mediaPonderada(byte[] pessoas, float[] pesos) {
        if (pessoas.length != pesos.length) return -1;

        int totalPesos = 0;
        for (byte i = 0; i < pessoas.length; i++) totalPesos += pessoas[i] * pesos[i];

        short totalPessoas = 0;
        for (byte pessoa : pessoas) totalPessoas += pessoa;

        return totalPesos / totalPessoas;
    }

    public static void main(String[] args) {
        byte[] pessoas = {1, 1};
        float[] pesos = {54.4f, 67.8f};
        System.out.println(mediaPonderada(pessoas, pesos));
    }
}