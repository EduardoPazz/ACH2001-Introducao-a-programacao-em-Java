class Ex10 {
    static boolean estaDecrescente(byte[] array) {
        for (byte i = (byte) (array.length - 1); i > 0; i--) if (array[i] > array[i-1]) return false;

        return true;
    }

    public static void main(String[] args) {
        byte[] array = {3};

        System.out.format("Está decrescente? %b\n", estaDecrescente(array));
    }
}