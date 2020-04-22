class Ex01 {

    static float maiorElemento(float[] array) {
        float maior = -9999999f;
        for (float element : array) if (maior < element) maior = element;
        return maior;
    }

    public static void main(String[] args) {
        float[] floats = {2, 3, 88, 4};
        System.out.println(maiorElemento(floats));
    }
}