class Ex07 {
    static boolean ePalindromo(byte[] array) {
        if (array.length == 1) return true;
        for (byte i = (byte) (array.length - 1); i >= 0; i--) if (array[i] != array[Math.abs(i+1 - array.length)]) return false;
        return true;
    }

    public static void main(String[] args) {
        byte[] array = {2, 3, 2, 3, 3, 2, 2};
        System.out.println(ePalindromo(array));
    }
}