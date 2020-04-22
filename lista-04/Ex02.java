class Ex02 {

    static void multiplo7(long[] array) {
        for (long element : array) if (element % 7 == 0) System.out.println(element);
    }

    public static void main(String[] args) {
        long[] numeros = {21, 49, 88, 4};
        multiplo7(numeros);
    }
}