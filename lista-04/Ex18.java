public class Ex18 {

    static byte greatest(byte[] array) {
        byte greatestElement = Byte.MIN_VALUE;
        byte greatestElementIndex = -1;

        for (byte i = (byte) (array.length - 1); i >= 0 ; i--) {
            if (array[i] >= greatestElement) {
                greatestElement = array[i];
                greatestElementIndex = i;
            }
        }
        
        return greatestElementIndex;
    }

    public static void main(String[] args) {
        byte[] array = {1, 1, 2, 2};
        System.out.format("Greatest element position: %d", 
            greatest(array));
    }
}    