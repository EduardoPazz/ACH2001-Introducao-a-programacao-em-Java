import java.util.Scanner;

class Ex19 {
    static Scanner input = new Scanner(System.in);

    static String firstLetterCapitalized(String string) {
        char[] charArray = string.toCharArray();
        byte code = (byte) charArray[0];

        if (
            code != 32 &&
            !isCapital(code)
        ) charArray[0] = (char) (code - (byte) 32);

        for (byte i = 1; i < charArray.length; i++ ) {
            code = (byte) charArray[i];

            if (
                !isCapital(code) &&
                isNonCapital(code) &&
                (byte) charArray[i - (byte) 1] == 32
            ) {
               charArray[i] = (char) (code - 32);
            }     
        }

        return new String(charArray);
    }

    static boolean isCapital(byte code) {
        return 65 <= code && code <= 90;
    }
    
    static boolean isNonCapital(byte code) {
        return 97 <= code && code <= 122;
    }    

    public static void main(String[] args) {
        System.out.print(
            "Provide a phrase to the first" + 
            "letter of each word to be capitalized: "
        );
        String string = input.nextLine();

        System.out.println(firstLetterCapitalized(string));
    }
}