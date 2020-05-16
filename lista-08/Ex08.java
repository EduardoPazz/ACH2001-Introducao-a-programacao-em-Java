class Ex08 {
    static boolean find(byte[] array, byte value) {
        byte min = 0;
        byte max = (byte) (array.length - 1);
        byte middle;

        while (min <= max) {

            middle = (byte) ((max + min) / 2);

            if (value == array[middle]) return true;

            if (value > array[middle]) {
                min = (byte) (middle + 1);
            } else {
                max = (byte) (middle - 1);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(
            find(
                new byte[] {1, 2, 3, 4, 6, 7, 8, 9, 10},
                (byte) 10
            )
        );
    }
}