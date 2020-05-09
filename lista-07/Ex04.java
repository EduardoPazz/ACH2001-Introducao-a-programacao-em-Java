class Ex04 {
    static boolean isPalindrome(String string) {
        char[] charArray = string.toCharArray();
        byte length = (byte) (charArray.length - 1);

        for (byte i = length, j; i >= 0; i--) {
            j = (byte) Math.abs(length - i);

            if (charArray[i] != charArray[j]) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("oovoo"));
    }
}