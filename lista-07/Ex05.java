class Ex05 {
    static String reverse(String string) {
        char[] charArray = string.toCharArray();
        byte length = (byte) (charArray.length - 1);
        char[] charArrayNew = new char[length + 1];

        for (byte i = length, j; i >= 0; i--) {
            j = (byte) Math.abs(length - i);

            charArrayNew[i] = charArray[j];
        }

        return new String(charArrayNew);
    }


    public static void main(String[] args) {
        System.out.println(reverse("anotaram a data da maratona"));
    }
}