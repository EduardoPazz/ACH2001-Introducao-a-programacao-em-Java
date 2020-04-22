public class Ex17 {

    static void palindrome(byte[] array) {
        // alt = alternative
        byte altIndex;
        byte altElement;

        for (byte i = (byte) ((array.length - 1) / 2); i >= 0 ; i--) {
            altIndex = (byte) Math.abs(i - array.length + 1);
            altElement = array[altIndex];
            array[altIndex] = array[i];
            array[i] = altElement;
        }
    }

    public static void main(String[] args) {
        byte[] array = {1, 2, 3, 4, 5, 6, 8, 9};
        palindrome(array);
        for (byte element : array) {
            System.out.println(element);
        }
    }
}    