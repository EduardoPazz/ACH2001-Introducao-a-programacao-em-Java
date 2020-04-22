public class Ex19 {

    static byte greatest(byte[] array) {
        byte greatestElement = Byte.MIN_VALUE;
        byte greatestElementIndex = -1;

        for (byte i = 0; i < array.length; i++) {
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