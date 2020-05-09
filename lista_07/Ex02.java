class Ex02 {
    static byte firstIncidenceOf(
        String string, char characterTest
    ) {
        char[] charArray = string.toCharArray();

        for (byte i = 0; i < charArray.length; i++) {
            if (charArray[i] == characterTest) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String string = "Example";
        char character = 'f';

        System.out.println(
            firstIncidenceOf(string, character)
        );
    }
}