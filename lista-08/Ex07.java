class Ex07 {
    static byte[] fusion(byte[] before, byte[] after) {
        byte[] finalArray = new byte[
            before.length + after.length
        ];

        for (byte i = 0; i < before.length; i++) {
            finalArray[i] = before[i];
        }

        for (byte i = (byte) before.length; i < finalArray.length; i++) {
            finalArray[i] = after[i - before.length];
        }

        return finalArray;
    }

    public static void main(String[] args) {
        byte[] array = fusion(
            new byte[] {1, 2, 3, 4, 5},
            new byte[] {6, 7, 8, 9, 10}
        );

        for (byte num : array) {
            System.out.print(num + " ");
        }
    }
}